public class HealthStation {
    
    private int count;
    
    public HealthStation(){
       
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);       
     
    }
    public int weighings(){
        return this.count;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight();
        
    }
 
}