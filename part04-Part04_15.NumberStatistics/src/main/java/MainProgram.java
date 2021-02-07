
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        //Statistics statistics = new Statistics();
        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        
        //statistics.addNumber(3);
        //statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);

        //System.out.println("Count: " + statistics.getCount());
        //System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());
        //int firstSum = statistics.sum();
        
        System.out.println("Enter numbers: ");
        int calcu = Integer.valueOf(scanner.nextLine());
        while (calcu != -1){
            totalSum.addNumber(calcu);
            if (calcu %2 == 0){
                evenSum.addNumber(calcu);
            }
            else{
                oddSum.addNumber(calcu);
            }
            calcu = Integer.valueOf(scanner.nextLine());
            if (calcu == -1){
                break;
            }
        }System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
