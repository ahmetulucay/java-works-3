
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scan.nextLine());
        if ( a > b ){
            System.out.println("Greater number is: " + a);
        }else if ( a < b ) {
            System.out.println("Greater number is: " + b);
        }else {
            System.out.println("The numbers are equal!");
        }
    }
}
