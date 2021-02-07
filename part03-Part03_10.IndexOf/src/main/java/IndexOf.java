
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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
        System.out.println("");
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());        
        for (int a=0;a<list.size();a++){
            if (list.get(a) == search){
                System.out.println(search+" is at index "+a);
            }
        }
        // implement here finding the indices of a number
    }
}
