
public class LiquidContainer1And2 {
    
    private int container1;
    private int container2;
    private int liquidAmount;
    
    public LiquidContainer1And2 (){
        this.container1=0;
        this.container2=0;
        this.liquidAmount=0;
    }
    
    public void addAmount(int liquidAmount){
        if (liquidAmount<0){
            this.container1=this.container1;
        }else{
            if (liquidAmount+this.container1<=100){
                this.container1+=liquidAmount;
            }else{
                this.container1=100;
            }
        }
        System.out.println("First: "+this.container1+"/"+100);
        System.out.println("Second: "+this.container2+"/"+100);
    }
    
    public void moveAmount(int liquidAmount){
        if (liquidAmount<0){
            this.container1=this.container1;
            this.container2=this.container2;
        }else{
            if(this.container1-liquidAmount>=0){
                this.container1=this.container1-liquidAmount;
                if (liquidAmount+this.container2<=100){
                    this.container2+=liquidAmount;   
                }else{
                    this.container2=100;
                }
            }else{
                if (this.container1+this.container2<=100){
                    this.container2+=this.container1;
                    this.container1=0;
                }else{
                    this.container1=0;
                    this.container2=100;
                }
            }
        }
        System.out.println("First: "+this.container1+"/"+100);
        System.out.println("Second: "+this.container2+"/"+100);
    }
    
    public void removeAmount(int liquidAmount){
        if (liquidAmount<0){
            this.container2=this.container2;
        }else{
            if(this.container2-liquidAmount>=0){
                this.container2=this.container2-liquidAmount;
            }else{
                this.container2=0;
            }
        }
        System.out.println("First: "+this.container1+"/"+100);
        System.out.println("Second: "+this.container2+"/"+100);
    }
}
