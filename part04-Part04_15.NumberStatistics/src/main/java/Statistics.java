
public class Statistics {
    
    private int count;
    private int sum;
    //private int number;
    //private double avg;
    
    public Statistics() {
        //int number;
        //int count;
        //int sum;
        //double avg;
    }

    public void addNumber(int number) {
        this.sum=this.sum+number;
        this.count +=1;
    }

    public int getCount() {
        return this.count;
    }
   
    public int sum() {
        return this.sum; 
    }
    
    public double average() {
        double avg = 0.0;
        if (this.getCount()!=0){
            avg = (double)this.sum()/this.getCount();
            return avg;
        }else{
            return avg;
        }
    }    
}
