
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName1 = "alex";
        String userName2 = "emma";
        String passWord1 = "sunshine";
        String passWord2 = "haskell";
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if ((username.equals(userName1) && password.equals(passWord1))||
                (username.equals(userName2) && password.equals(passWord2))){
            System.out.println("You have succesfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
