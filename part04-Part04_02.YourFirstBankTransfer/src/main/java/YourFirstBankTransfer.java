
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account mattAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattAccount.toString());
        System.out.println(myAccount.toString());
        // Do not touch the code in Account.java
        // write your program here
    }
}
