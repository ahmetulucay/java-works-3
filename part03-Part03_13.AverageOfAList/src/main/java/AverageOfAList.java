
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            sum = sum + input;
            count +=1;
            list.add(input);
        }
        double avg = (double)sum/count;

        System.out.println("");
        System.out.println("Average: " + avg);

        // toteuta listan lukujen summan laskeminen tänne
    }
}