
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String threeTimes = scanner.nextLine();
        System.out.println(threeTimes+threeTimes+threeTimes);

    }
}
