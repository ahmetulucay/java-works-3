import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());            
            programs.add(new TelevisionProgram(programName, programDuration));
        }
        System.out.println("Program's max duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs){
            if (program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }
    }
}
