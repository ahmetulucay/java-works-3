
import java.util.Scanner;
import java.nio.file.Paths;

public class Program {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
