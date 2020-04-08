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

        //System.out.println((int)ch);

        switch(ch) {
            case 'w':
                System.out.println("blabla1");
                break;
            case 's':
                System.out.println("blabla2");;
                break;
            case 'a':
                System.out.println("blabla3");
                break;
            case 'd':
                System.out.println("blabla4");
                break;  
        }
    }
}