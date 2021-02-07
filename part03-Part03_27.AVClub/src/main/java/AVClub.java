
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            while (true){
                String input = scanner.nextLine();        
                if (!(input.equals(""))){
                    String[] array = input.split(" ");
                    for (String item : array) {
                        if (item.contains("av")){
                            System.out.println(item);
                        }
                    }
                }else{
                    break;
                } 
            }
    }
}