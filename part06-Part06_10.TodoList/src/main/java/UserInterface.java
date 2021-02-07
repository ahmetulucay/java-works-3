
import java.util.Scanner;

public class UserInterface {
    private TodoList listFraClass;
    private Scanner scan;
    
    public UserInterface(TodoList listFraClass, Scanner scan){
        this.listFraClass=listFraClass;
        this.scan=scan;
    }
    
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")){
                System.out.print("To add: ");
                String word = scan.nextLine();
                this.listFraClass.add(word);
            }
            if (command.equals("list")){
                this.listFraClass.print();
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed?");
                int removeTaskNo = Integer.valueOf(scan.nextLine());
                this.listFraClass.remove(removeTaskNo);
            }
        }
    }
}    
