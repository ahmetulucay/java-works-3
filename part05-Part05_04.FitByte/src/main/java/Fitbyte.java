/**
 *
 * @author Eier
 */
public class Fitbyte {
    private int age;
    private int restingHeart;
    
    public Fitbyte(int age, int restingHeart){
        this.age=age;
        this.restingHeart=restingHeart;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = ((206.3)-(0.71 * this.age));
        double targetRate = ((maxHeartRate-this.restingHeart)*(percentageOfMaximum))+this.restingHeart;
        return targetRate;
    }
}