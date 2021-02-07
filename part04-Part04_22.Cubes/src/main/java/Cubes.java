
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cube = 0 ;
        while (sc.hasNextLine()){
            String word = sc.nextLine();
            if (word.equals("end")){
                break;
            }
            int a = Integer.valueOf(word);
            cube = a*a*a;
            System.out.println(cube);
        }
    }
}
