

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int toOne){
        
        int a = 1;
        
        while (a<=toOne){
            System.out.println(toOne);
            toOne -=1;
        }
        
    }

}
