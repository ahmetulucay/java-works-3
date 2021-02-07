
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;

        while (true){        
            int a = Integer.valueOf(scanner.nextLine());
            if (a != 0 && a>0){
                sum +=a;
                count +=1;
            }else if (a == 0){
                break;
            }
        }double average = (double)sum/count;
        if (count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(average);
        }
    }
}