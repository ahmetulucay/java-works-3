
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = Integer.valueOf(scan.nextLine());

        if ( a % 2 == 0 ){
            System.out.println("Number " + a + " is even.");
        }else  {
            System.out.println("Number " + a + " is odd.");
        }
    }
}
