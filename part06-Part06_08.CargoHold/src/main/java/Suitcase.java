
import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> itemsSuitcase;
    
    public Suitcase(int weight){
        this.maxWeight=weight;
        itemsSuitcase = new ArrayList<>();
    }
    
    public int totalWeight(){
        int totalWeightItems =0;
        for(int a=0;a<itemsSuitcase.size();a++){
            totalWeightItems = totalWeightItems + itemsSuitcase.get(a).getWeight();
        }return totalWeightItems;
    }
    
    public Item heaviestItem(){
        if (itemsSuitcase.isEmpty()){
            return null;
        }int heaviesT=0;
        int heaviesTindex=0;
        for(int a=0;a<itemsSuitcase.size();a++){
            if(itemsSuitcase.get(a).getWeight()>heaviesT){
                heaviesT=itemsSuitcase.get(a).getWeight();
                heaviesTindex=a;
            }
        }return itemsSuitcase.get(heaviesTindex);
    }
    
    public void addItem(Item item){
        if ((this.totalWeight())+item.getWeight()<=maxWeight){
           itemsSuitcase.add(item);
        }
    }

    public void printItems(){
        String newString = "";
        for (int a=0;a<itemsSuitcase.size();a++){
            newString = itemsSuitcase.get(a).getName();
            newString = newString.substring(0, 1).toUpperCase()+newString.substring(1);
            System.out.println(newString+" ("+itemsSuitcase.get(a).getWeight()+" kg)");
        }
    }
    
    public String toString() {
        if (itemsSuitcase.isEmpty()){
            return "no items ("+this.totalWeight()+" kg)";
        }
        if (itemsSuitcase.size()==1){
            return itemsSuitcase.size()+" item ("+this.totalWeight()+" kg)";
        }return itemsSuitcase.size()+" items ("+this.totalWeight()+" kg)";
    }
}
