
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            while (true){
                String input = scanner.nextLine();        
                if (!(input.equals(""))){
                    String[] array = input.split(" ");
                    System.out.println(array[array.length-1]);
                }else{
                    break;
                } 
            }

    }
}
