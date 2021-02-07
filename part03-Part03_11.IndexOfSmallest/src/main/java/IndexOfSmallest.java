
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        int smallest = list.get(0);        
        for (int a=0;a<list.size();a++){
            if (list.get(a) < smallest){
                smallest = list.get(a);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int b=0;b<list.size();b++){
            if (list.get(b) == smallest){
                System.out.println("Found at index: " + b);
            }
        }
    }
}
