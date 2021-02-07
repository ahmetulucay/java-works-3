
import java.util.ArrayList;

public class Hold {
      
    private int maxWeight;
    private ArrayList<Suitcase> itemsHold;
    private int total;
    
    public Hold(int weightMax){
        this.maxWeight=weightMax;
        itemsHold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (total+suitcase.totalWeight()<=this.maxWeight){
            itemsHold.add(suitcase);  
            total=total+suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return itemsHold.size()+" suitcases ("+total+" kg)";
    }
    
    public void printItems(){
        for (int a=0;a<itemsHold.size();a++){
            itemsHold.get(a).printItems();
        }
    }
}
