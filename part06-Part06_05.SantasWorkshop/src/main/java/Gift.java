
public class Gift {
    
    private String name;
    private int itemWeight;

    public Gift(String name, int itemWeight){
        this.name=name;
        this.itemWeight=itemWeight;
    }
    public String getName() { //which returns the name of the gift
        return this.name;
    }

    public int getWeight() { //which returns the weight of the gift
        return this.itemWeight;
    }

    @Override
    public String toString() { //which returns a string in the form "name (weight kg)"
        return this.name+" ("+this.itemWeight+" kg)";
    }
}
