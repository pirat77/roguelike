import java.util.Random;

public class Board {

    static Random generator = new Random();

    int LEN=30;
    Area[][] map;
    static Enemy[] enemys = new Enemy[5];

    Board(){
        this.map = new Area[LEN][LEN];
        for (int i=0; i<LEN; i++){
            for (int j=0; j<LEN; j++){
                this.map[i][j] = new Area();
            }
        } 
    }

    static void generateBoard(Board board){
        
        Terrain wall = new Terrain();
        wall.setSymbol('#');
        wall.setCanPass(false);
        for (int i=0; i<board.LEN; i++){
            for (int j=0; j<board.LEN; j++){
                board.map[i][j].entityList.add(wall);
            }
        }    
        generateEnemys(board);
        
        genPath(board, 0, 0, wall);
        genPath(board, board.LEN-1, board.LEN-1, wall);
        genPath(board, 0, board.LEN-1, wall);
        genPath(board, board.LEN-1, 0, wall);
        genPath(board, board.LEN/2, board.LEN/2, wall); 
        genPath(board, board.LEN/2, 0, wall);
        genPath(board, 0, board.LEN/2, wall);
        genPath(board, board.LEN-1, board.LEN/2, wall);
        genPath(board, board.LEN/2, board.LEN-1, wall);
        while (true){
            int x = generator.nextInt(board.LEN-1);
            int y = generator.nextInt(board.LEN-1);
            if (board.map[x][y].entityList.size() == 0){
                board.map[x][y].entityList.add(new Miscallenous());
                break;
            }
        }       
    }

    static void generateEnemys(Board board){
        for (int i = 0; i<5; i++){
            int x = generator.nextInt(board.LEN);
            int y = generator.nextInt(board.LEN);
            enemys[i] = new Enemy();
            enemys[i].setCoordinates(x, y);
            board.map[x][y].entityList.add(enemys[i]);
        }
    }

    static void genPath(Board board, int x, int y, Terrain wall){
        if (board.map[x][y].entityList.size()>0){
            board.map[x][y].entityList.remove(wall);
        }

        int caseof = generator.nextInt(8);
        if (caseof==1) try {genPath(board, x+1, y+1, wall);} catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);}; 
        if (caseof==0) try {genPath(board, x+1, y, wall);} catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==7) try {genPath(board, x-1, y+1, wall);}  catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==6) try {genPath(board, x-1, y, wall);}  catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==5) try {genPath(board, x, y+1, wall);}  catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==4) try {genPath(board, x, y-1, wall);}  catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==3) try {genPath(board, x-1, y-1, wall);}  catch (ArrayIndexOutOfBoundsException e) {genPath(board, x, y, wall);};
        if (caseof==2) try {genPath(board, x+1, y-1, wall);}  catch (ArrayIndexOutOfBoundsException e) {}; 

    }

}