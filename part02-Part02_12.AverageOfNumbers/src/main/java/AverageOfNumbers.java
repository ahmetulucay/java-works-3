
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;

        while (true){        
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if (a != 0){
                sum +=a;
                count +=1;
            }else if (a == 0){
                break;
            }
        }double average = (double)sum/count;
        System.out.println("Average of the numbers: "+ average);
    }
}
