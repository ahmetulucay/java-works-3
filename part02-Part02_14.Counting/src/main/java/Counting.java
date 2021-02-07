
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.valueOf(scanner.nextLine());
        int b = 0;
        
        while (b<=a){
            System.out.println(b);
            b+=1;
        }
    }
}
