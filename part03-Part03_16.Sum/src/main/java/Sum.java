
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        sum(numbers);
    }
    
    public static int sum(ArrayList<Integer> numbers){
        
        int count = 0;
        for (int a = 0;a<numbers.size();a++){
            count += numbers.get(a);            
        }return count;
    }
}
