
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[]partsInput = input.split(" ");
            input = partsInput[0];
            int amount = Integer.valueOf(partsInput[1]);
            if (input.equals("add")) {
                container1.add(amount);
            }if (input.equals("move")) {
                if (amount > container1.contains()){
                    amount = container1.contains();
                }
                container1.remove(amount);
                container2.add(amount);
            }
            if (input.equals("remove")) {
                container2.remove(amount);
            }
        }
    }
}