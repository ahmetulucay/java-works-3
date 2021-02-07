
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        int max=0;
        int maxIndex=0;
        if (this.elements.isEmpty()){
            return null;
        }
        for(int a = 0; a<elements.size();a++){
            if (this.elements.get(a).length()>max){
                max = this.elements.get(a).length();
                maxIndex=a;
            }
        }return this.elements.get(maxIndex);
    }
}
