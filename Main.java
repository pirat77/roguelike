import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

    private static class Game extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
    

            char ch = event.getKeyChar();
    
            board.map[player.getX()][player.getY()].entityList.remove(player);
            int[] borders = new int[] {-1, board.LEN};

            switch(ch) {
                case 'w':
                    if (!contains(borders, player.getY()-1) && board.map[player.getX()][player.getY()-1].isPenetrable()) player.setCoordinates(player.getX(), player.getY()-1);
                    player.setSymbol('^');
                    break;
                case 's':
                    if (!contains(borders, player.getY()+1) && board.map[player.getX()][player.getY()+1].isPenetrable()) player.setCoordinates(player.getX(), player.getY()+1);
                    player.setSymbol('v');
                    break;
                case 'a': 
                    if (!contains(borders, player.getX()-1) && board.map[player.getX()-1][player.getY()].isPenetrable()) player.setCoordinates(player.getX()-1, player.getY());
                    player.setSymbol('<');
                    break;
                case 'd':                    
                    if (!contains(borders, player.getX()+1) && board.map[player.getX()+1][player.getY()].isPenetrable()) player.setCoordinates(player.getX()+1, player.getY());
                    player.setSymbol('>');
                    break;
                case 'p':
                    shoot();
                    break;
                case '`':
                    System.exit(0);
            }
            
            (board.map[player.getX()][player.getY()]).entityList.add(player);
            processTurn();

            
        }

        void shoot(){
            player.ammo-=1;
        }

        public static boolean contains(final int[] array, final int v) {

            boolean result = false;
    
            for(int i : array){
                if(i == v){
                    result = true;
                    break;
                }
            }
    
            return result;
        }

        private static void processTurn(){
            UserInterface.clearScreen();
            UserInterface.readBoard(board);
            for (Enemy enemy : Board.enemys) {
                enemyMove(enemy);
                System.out.println("Enemy x = " + enemy.getX() + " Enemy y = " + enemy.getY());               
            }
            System.out.println("Life toal = " + player.lives);  
            System.out.println("Ammo = " + player.ammo);          
        }



        private static void enemyMove(Enemy enemy){
            if ((Math.abs(player.getX()-enemy.getX()) <= enemy.visionValue) && (Math.abs(player.getY()-enemy.getY()) <= enemy.visionValue)){
                board.map[enemy.getX()][enemy.getY()].entityList.remove(enemy);
                if (player.getY() > enemy.getY()) enemy.setCoordinates(enemy.getX(), enemy.getY()+1);
                if (player.getY() < enemy.getY()) enemy.setCoordinates(enemy.getX(), enemy.getY()-1);
                if (player.getX() > enemy.getX()) enemy.setCoordinates(enemy.getX()+1, enemy.getY());
                if (player.getX() < enemy.getX()) enemy.setCoordinates(enemy.getX()-1, enemy.getY());
                board.map[enemy.getX()][enemy.getY()].entityList.add(enemy);    
            }
        }


    }

    static Character player = new Character();
    static Board board = new Board();

    public static void main(String[] args) {
        Board.generateBoard(board);
        player.setCoordinates(board.LEN/2, board.LEN/2);
        (board.map[player.getX()][player.getY()]).entityList.add(player);
        UserInterface.clearScreen();
        UserInterface.readBoard(board);
        System.out.println("Life total = " + player.lives);  
        System.out.println("Ammo = " + player.ammo);  


        JTextField textField = new JTextField();
        
        textField.addKeyListener(new Game());

        JFrame jframe = new JFrame();

        jframe.add(textField);
        jframe.setSize(5, 5);
        jframe.setVisible(true);
    }
}


