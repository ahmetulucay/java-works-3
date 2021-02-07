
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account myAccount = new Account("My Account", 100.0);
        
        myAccount.deposit(20.0);
        
        System.out.println(myAccount.toString());
        // Do not touch the code in Account.java
        // Write your program here
    }
}
