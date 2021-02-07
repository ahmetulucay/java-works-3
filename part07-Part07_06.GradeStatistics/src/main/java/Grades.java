
import java.util.ArrayList;

public class Grades {
   private ArrayList <Integer> list;
    private ArrayList <Integer> grades;
    
    
    public Grades (){
        this.list=new ArrayList<>();
        this.grades=new ArrayList<>();
}
    public void addPoint(int point){
        if (point>=0 && point<=100){
                list.add(point);
        }
    }
    public int listSize(){
        return this.list.size();
    }
    
    public double pointAverage(){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i);
        }
        return sum/list.size();
    }
    
    public double gecPointAverage(){
        double sum=0;
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>=50){
                sum=sum+list.get(i);
                count++;
            }
        }
        return sum/count;
    }
    
    public double gecPointPercent(){
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>=50){
                count++;
            }
        }
        return 100.0*count/list.size();
    }
    
    public void addGrade(){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<50){
                grades.add(0);
            }else if(list.get(i)<60){
                grades.add(1);
            }else if(list.get(i)<70){
                grades.add(2);
            } else if (list.get(i)<80){
                grades.add(3);
            }else if (list.get(i)<90){
                grades.add(4);
            }else {
                grades.add(5);
            }                
        }
    }
    
    public void gradesStars(){
        for (int i = 5; i >=0 ; i--) {
            String stars="";
            for (int j = 0; j < grades.size(); j++) {
                if(i == grades.get(j)){
                    stars=stars+"*";
                }
            }
            System.out.println(i + ": " + stars);
        }
    }    
}