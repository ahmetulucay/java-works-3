
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.valueOf(scanner.nextLine());
        int b = 100;
        
        while (a<=b){
            System.out.println(a);
            a+=1;
        }
    }
}