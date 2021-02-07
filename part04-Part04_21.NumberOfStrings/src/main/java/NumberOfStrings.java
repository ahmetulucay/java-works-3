
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        while (sc.hasNextLine()){
            String word = sc.nextLine();
            if (word.equals("end")){
                break;
            }
            count +=1;
        }System.out.println(count);
    }
}
