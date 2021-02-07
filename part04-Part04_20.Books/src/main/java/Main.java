
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();

        while (true) {
            //System.out.println("Title: ");
            String Title = scanner.nextLine();
            if (Title.isEmpty()) {
                break;
            }
            //System.out.println("Pages: ");
            int Pages = Integer.valueOf(scanner.nextLine());
            //System.out.println("Pub Year: ");
            int PubYear = Integer.valueOf(scanner.nextLine());

            bookInfo.add(new Book(Title, Pages, PubYear));
        }
        //System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {
            for (Book book : bookInfo) {
                System.out.println(book);
            }
        }if (answer.equals("name")) {
            for (Book book : bookInfo) {
                System.out.println(book.getName());
            }
        }
    }
}
