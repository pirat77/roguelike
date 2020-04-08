import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    Map<String, Integer> menuOptions = new HashMap<String, Integer>();

    public void fillMapWithOptions() {
        menuOptions.put("(1) Play The Game", 0);
        menuOptions.put("(2) Options", 1);
        menuOptions.put("(3) Creators List", 2);
        menuOptions.put("(4) Quit", 3);

    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }

    public static char getInput(String message){
        char userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.next().charAt(0);
        return userInput;
    }

    public static void welcomeScreen(){
        clearScreen();
        System.out.println("\nWelcome To Roguelike Project\n");
    }
    
    public static void endgameScreen(){
        clearScreen();
        System.out.println("\nYou Loose\n");
    }

    public static void victoryScreen(){
        clearScreen();
        System.out.println("\nYou Win\n");
    }


    public static void storyScreen(){

    }

    public static void gameMenu(){

    }

    public static void creatorsList(){
        System.out.println("This Game Was Created By: \n");
        System.out.println("Jan Mikos");
        System.out.println("Miłosz Buchacz");
        System.out.println("Michał Myczka");     
    }

    public static void quitGame(){
        System.exit(0);
    }
}