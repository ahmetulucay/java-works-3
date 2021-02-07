
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int longestName = 0;
        int countYears = 0;
        int countPerson = 0;
        String loName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            
            int years = Integer.valueOf(parts[1]);
            int nameLong = parts[0].length();
            
            if (nameLong>longestName){
                longestName=nameLong;
                
                loName = parts[0];                
                
            }countPerson +=1;
            countYears += years;
        }System.out.println("Longest name: " + loName );
        System.out.println("Average of the birth years: " + ((double)countYears/countPerson));
    }
}
