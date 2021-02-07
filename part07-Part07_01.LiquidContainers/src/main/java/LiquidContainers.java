
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer1And2 liquidOp = new LiquidContainer1And2();
        
        System.out.println("First: "+0+"/"+100);
        System.out.println("Second: "+0+"/"+100);
         
        while (true) {
            String input = scan.next ();
            if (input.equals("quit")) {
                break;
            }if (input.equals("add")){
                int amount = Integer.valueOf(scan.next ());
                System.out.println();
                liquidOp.addAmount(amount);
            }if (input.equals("move")){
                int amount = Integer.valueOf(scan.next ());
                System.out.println();
                liquidOp.moveAmount(amount);
            }if (input.equals("remove")){
                int amount = Integer.valueOf(scan.next ());
                System.out.println();
                liquidOp.removeAmount(amount);
            }
        }
    }
}
