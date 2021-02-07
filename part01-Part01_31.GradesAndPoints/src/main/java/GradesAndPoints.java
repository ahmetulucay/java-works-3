
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int a = Integer.valueOf(scan.nextLine());

        if ( a < 0 ){
            System.out.println("Grade: impossible!");
        }else if ( a <= 49 ) {
            System.out.println("Grade: failed");
        }else if ( a <= 59 ) {
            System.out.println("Grade: " + 1);
        }else if ( a <= 69 ) {
            System.out.println("Grade: " + 2);
        }else if ( a <= 79 ) {
            System.out.println("Grade: " + 3);
        }else if ( a <= 89 ) {
            System.out.println("Grade: " + 4);
        }else if ( a <= 100 ) {
            System.out.println("Grade: " + 5);
        }else {
            System.out.println("Grade: incredible!");
        }
    }
}
