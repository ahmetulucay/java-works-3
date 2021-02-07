
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("First name: ");            
            String name1 = scanner.nextLine();
            if (name1.isEmpty()){
                break;
            }
            System.out.println("Last name: ");            
            String name2 = scanner.nextLine();
            System.out.println("Id No: ");            
            String name3 = scanner.nextLine();
            infoCollection.add(new PersonalInformation(name1, name2, name3));
        }for (PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName()+" "+info.getLastName());
        }
    }
}
