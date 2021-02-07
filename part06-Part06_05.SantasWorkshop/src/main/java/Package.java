
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;
    
    public Package(){
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int total = 0;
     /* for(Gift gifTek : gifts){
            total = total + gifTek.getWeight();*/
        for(int a=0;a<gifts.size();a++){
            total = total +this.gifts.get(a).getWeight();
        }return total;
    }
}
