
import java.util.ArrayList;

public class Room {
    
   private ArrayList<Person> perInfo;
    
    public Room(){
        perInfo = new ArrayList<>();
    }
    
    public void add(Person person){
        perInfo.add(person);
    }
    
    public boolean isEmpty(){
        return perInfo.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.perInfo;
    }
    
    public Person shortest(){
        int shorTest=0;
        int shorTestIndex=0;
        if(perInfo.isEmpty()){
            return null;
        }shorTest = perInfo.get(0).getHeight();
        for(int a=0;a<perInfo.size();a++){
            if (perInfo.get(a).getHeight()<shorTest){
                shorTest = perInfo.get(a).getHeight();
                shorTestIndex = a;
            }
        }return perInfo.get(shorTestIndex);
    }
    
    public Person take(){
        int shorTest=0;
        int shorTestIndex=0;
        if(perInfo.isEmpty()){
            return null;
        }shorTest = perInfo.get(0).getHeight();
        for(int a=0;a<perInfo.size();a++){
            if (perInfo.get(a).getHeight()<shorTest){
                shorTest = perInfo.get(a).getHeight();
                shorTestIndex = a;
            }
        }return perInfo.remove(shorTestIndex);
    }
}
