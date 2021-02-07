
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            
            int yas = Integer.valueOf(parts[1]);
            
            if (yas>max){
                max=yas;
                oldestName = parts[0];                
            }
        }System.out.println("Name of the oldest: "+ oldestName );
    }
}
