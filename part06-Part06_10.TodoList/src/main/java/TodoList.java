
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> List;
    
    public TodoList(){
        this.List = new ArrayList<>();
    }
    
    public void add(String task){
        this.List.add(task);
    }
    
    public void print(){
        for(int a =0 ;a<List.size();a++){
            System.out.println((a+1)+": "+List.get(a));
        }
    }
    
    public void remove(int number){
        List.remove(number-1);
    }
}
