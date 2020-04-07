import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
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

        System.out.println((int)ch);

        switch(ch) {
            case 'w':
                player.move(0, -1);
                break;
            case 's':
                player.move(0, 1);
                break;
            case 'a':
                player.move(-1, 0);
                break;
            case 'd':
                player.move(1, 0);
                break;  
        }
    }
}