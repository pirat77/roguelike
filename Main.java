import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {



    public static void main(String[] args) {
        Board board = new Board();
        Character player = new Character();

        JTextField textField = new JTextField();

        textField.addKeyListener(new Game());
        JFrame jframe = new JFrame();

        jframe.add(textField);
        jframe.setSize(100, 100);
        jframe.setVisible(true);
            
    }
}

class Game extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent event) {

        char ch = event.getKeyChar();


        switch(ch) {
            case 'w':
                System.out.println("@");
                break;
            case 's':
                System.out.println("#");
                break;
            case 'a':
                System.out.println("%");
                break;
            case 'd':
                System.out.println("*");
                break;
        }
    }
}
