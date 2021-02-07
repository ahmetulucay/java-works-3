
import java.util.ArrayList;

public class Birds {
    
    private String birdName;
    private String birdLatin;
    private Integer count;
    private ArrayList<String> birdy;
    
    public Birds(String nameBird, String nameLatinBird, int count){
        this.birdName=nameBird;
        this.birdLatin=nameLatinBird;
        this.count=0;
        this.birdy=new ArrayList();
    }
    
    public boolean nameBird(String searchedBird) {
        return this.birdName.substring(0).equals(searchedBird);
    }
    
    public int countObs(int count){
        this.count += count;
        return this.count;
    }
    
    @Override
    public String toString(){
        return this.birdName+" ("+this.birdLatin+"): "+this.count+" observations";
    }

}
