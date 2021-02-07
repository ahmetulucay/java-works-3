
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

    }
    public static void divisibleByThreeInRange(int a, int b){
     
        while (a<=b){
            if (a%3==0){
                System.out.println(a);
            }
            a +=1;
        }
    }

}
