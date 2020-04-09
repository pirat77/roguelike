import java.util.Random;

public class Board {

    static Random generator = new Random();

    int LEN=20;
    Area[][] map;

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
        genPath(board, 0, 0, wall);
        genPath(board, board.LEN-1, board.LEN-1, wall);
        genPath(board, 0, board.LEN-1, wall);
        genPath(board, board.LEN-1, 0, wall);
        genPath(board, 7, 7, wall); 
        genPath(board, 7, 0, wall);
        genPath(board, 0, 7, wall);
        genPath(board, board.LEN-1, 7, wall);
        genPath(board, 7, board.LEN-1, wall);       
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
        if (caseof==3) try {genPath(board, x-1, y-1, wall);}  catch (ArrayIndexOutOfBoundsException e) {};
        if (caseof==2) try {genPath(board, x+1, y-1, wall);}  catch (ArrayIndexOutOfBoundsException e) {}; 

    }

}