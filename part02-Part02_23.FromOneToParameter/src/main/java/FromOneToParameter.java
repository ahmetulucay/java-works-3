

public class FromOneToParameter {
    
    
    public static void main(String[] args) {
        
        printUntilNumber(5);
    }

    public static void printUntilNumber(int until){
       
        int a = 1;
        
        while (a<=until){
            System.out.println(a);
            a +=1;
        }
    }
}
