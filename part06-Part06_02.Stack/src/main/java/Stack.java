
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stackS ;
    
    public Stack(){
        this.stackS = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stackS.isEmpty();
    }
    
    public void add(String value){
        this.stackS.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stackS;
    }
    
    public String take(){
        return this.stackS.remove(this.stackS.size()-1);
    }
}
