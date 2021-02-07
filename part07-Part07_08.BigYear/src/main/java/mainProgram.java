
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Birds> birdWatcher = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Add")) {                                        // Add - adds a bird
                System.out.print("Name: ");
                String nameBird = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatinBird = scanner.nextLine();
                int count=0;
                Birds birdObje = new Birds(nameBird, nameLatinBird, count);
                birdWatcher.add(birdObje);
            }
            
            if (command.equals("Observation")) {                                // Observation - adds an observation
                int count = 0;
                System.out.print("Bird? ");
                String searchedBird = scanner.nextLine();
                for (Birds birdy : birdWatcher) {
                    if (birdy.nameBird(searchedBird)) {
                        count = 1;
                        birdy.countObs(count);                                  // add observation count..
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")) {                                        // All - prints all bird
                for (Birds birdy : birdWatcher){
                    System.out.println(birdy);
                }
            }
 
            if (command.equals("One")) {                                        // One - prints one bird
                System.out.print("Bird? ");
                String searchedFor = scanner.nextLine();
                for (Birds birdy : birdWatcher){
                    if (birdy.nameBird(searchedFor)) {
                        System.out.println(birdy);
                    }
                }
            }
                        
            if (command.equals("Quit")) {                                       // Quit - ends the program
                break;
            }
        }            
    }
}
