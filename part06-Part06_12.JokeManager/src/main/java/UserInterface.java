
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokeUI;
    private Scanner scanUI;    
    
    public UserInterface(JokeManager jokeUI ,Scanner scanUI){
        this.jokeUI = jokeUI;
        this.scanUI = scanUI;
    }
    
    public void start(){
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = this.scanUI.nextLine();
            if (command.equals("X")) {
                break;
            }
              else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanUI.nextLine();
                this.jokeUI.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeUI.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeUI.printJokes();
            }
        }
    }
}
