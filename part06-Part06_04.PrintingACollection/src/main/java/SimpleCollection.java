
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
    
    public String toString(){
        String input1 = "";
        String output = "The collection " + this.name + " is empty.";
        if (this.elements.isEmpty()) {
            return output;
        }if (this.elements.size()==1){
            input1 = "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n";
        }if (this.elements.size()>1){
            input1 = "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n";
        }
        String input2 = "";
        for (String element : elements) {
            if (this.elements.size()==1){ 
                input2 = input2 + element;
            }if (this.elements.size()>1){
                input2 = input2 + element+"\n";
            }
        }return input1+input2;
    }
}
