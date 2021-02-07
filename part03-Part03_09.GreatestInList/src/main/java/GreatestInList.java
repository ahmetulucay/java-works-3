
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int greatest = list.get(0);
        for (int a=0;a<list.size();a++){
            if (list.get(a)>greatest){
                greatest=list.get(a);
            }
        }
        System.out.println("");
        System.out.println("The greatest number: " + greatest);

        // implement finding the greatest number in the list here
    }
}
