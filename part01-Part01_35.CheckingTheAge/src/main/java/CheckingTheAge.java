
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yas = Integer.valueOf(scan.nextLine());
        
        if (yas >= 0 && yas <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
