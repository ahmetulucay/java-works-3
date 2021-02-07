
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String Line = scanner.nextLine();
            if (Line.equals("")) {
                break;
            }
            String[] array = Line.split(" ");
            for (String item : array) {
                System.out.println(item);
            }
        }
    }
}