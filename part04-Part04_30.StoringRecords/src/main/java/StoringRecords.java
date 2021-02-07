
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String person = scanner.nextLine();
                String[] perInfo = person.split(",");
                String name = perInfo[0];
                int age = Integer.valueOf(perInfo[1]);
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return persons;

    }
}
