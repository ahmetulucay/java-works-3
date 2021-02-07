
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kenari giriniz: ");
        int edge = Integer.valueOf(scanner.nextLine());
        Cube edgeObje = new Cube(edge);
        System.out.println(edgeObje.volume());
        System.out.println(edgeObje);
        // Experiment with your program here
    }
}
