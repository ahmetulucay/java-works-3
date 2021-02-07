
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        int a = 1;
        
        while (a<=number){
            factorial *= a;
            a +=1;
        }System.out.println("Factorial: " + factorial);
    }
}