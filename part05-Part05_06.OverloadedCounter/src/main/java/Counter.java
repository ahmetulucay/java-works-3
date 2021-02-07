/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eier
 */
public class Counter {
    int startValue;
    
    public Counter(int startValue){
        this.startValue = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.startValue;
    }
    
    public void increase(){
        this.startValue = this.startValue+1;
    }
    
    public void decrease(){
        this.startValue = this.startValue-1;
    }

    public void increase(int increaseBy){
        if (increaseBy<0){
            return;
        }else{
            this.startValue = this.startValue+increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy<0){
            return;
        }else{
            this.startValue = this.startValue-decreaseBy;
        }
    }
}
