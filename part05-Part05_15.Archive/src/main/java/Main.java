
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        String identifier = null; 
        String name = null;
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Book book = new Book(identifier, name);
            int i=0,count=0;
            while (i<books.size()){
                if (books.get(i).equals(book)){
                    count++;
                    break;
                }
                i++;
            }
            if (count==0){
                books.add(book);
            }
        }
        // NB! Don't alter the line below!
        int i=0;
        while (i<books.size()){
            System.out.println(books.get(i).getIdentifier()+": " +books.get(i).getName());
            i++;
        }
    }
}
