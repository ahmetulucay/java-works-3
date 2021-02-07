
public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:

        
        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        String s = b.getAuthor()+", "+b.getName()+", "+b.getPages()+"[ pages]";
        System.out.println(s);

    }
}
