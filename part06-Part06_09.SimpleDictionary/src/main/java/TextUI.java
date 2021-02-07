
import java.util.Scanner;

public class TextUI {
    
    private Scanner scan;
    private SimpleDictionary simple;

    public TextUI(Scanner scan, SimpleDictionary simple){
       this.scan = scan;
       this.simple = simple;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();
                this.simple.add(word, translation);
            }else if(command.equals("search")){
                System.out.print("To be translated: ");
                String wordToTranslate = scan.nextLine();
                if(this.simple.translate(wordToTranslate) == null){
                    System.out.println("Word "+wordToTranslate +" was not found");
                }else{
                    System.out.println("Translation: "+this.simple.translate(wordToTranslate));
                }
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
}
