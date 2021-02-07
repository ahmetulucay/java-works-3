
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance=this.balance+openingBalance;
    }
    
    public void eatAffordably(){
        if (this.balance>=2.60){
            this.balance = this.balance-2.60;
        }
    }
    
    public void eatHeartily(){
        if (this.balance>=4.60){
            this.balance = this.balance-4.60;
        }
    }
    
    public void addMoney(double amount){
        if (!(amount<0)){
            if ((this.balance+amount)>150.0){
                this.balance=150.0;
            }else{
                this.balance = this.balance+amount;
            }
        }
    }
    
    public String toString(){
        return ("The card has a balance of " + this.balance+ " euros");
    }
}
