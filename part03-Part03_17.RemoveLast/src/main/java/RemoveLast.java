
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(); 
        
        removeLast(strings);
    }
    
    public static void removeLast(ArrayList<String> strings){
        if (strings.size() != 0){
            strings.remove(strings.size()-1);            
        }
    }
}
