
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int a = 0;
        int b = 5;
        /* numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        */ 
        // System.out.println("The numbers in the range ["+ 0 + ", "+ 5 + "]");
        printNumbersInRange(numbers, a, b);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int a =0 ; a<numbers.size();a++){
            if (numbers.get(a)>= lowerLimit && numbers.get(a)<=upperLimit){
                System.out.println(numbers.get(a));
            }   
        }
    }
   
}
