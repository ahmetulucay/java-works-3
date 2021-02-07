
public class AdvancedAstrology {

    public static void printStars(int number) {
        int one = 1;
        while (one <= number){
            System.out.print("*");
            one += 1;
        }System.out.println("");
    }

    public static void printSpaces(int number) {
        int one = 1;
        while (one <= number){
            System.out.print(" ");
            one += 1;
        }
    }
    
    public static void printTriangle(int size) {
        int one = 1; 
        int a = 1;
        int b = size;
        
        while (one <= size){
            while (a<b){
                System.out.print(" ");
                a +=1;
            }a = 1;
            while (a<=one){
                System.out.print("*");
                a +=1;
            }System.out.println("");
            a = 1;
            one += 1;
            b -=1;
        }
    }

    public static void christmasTree(int height) {
        int one = 1; 
        int a = 1;
        int b = height;
        int maxStar = (2 * height)-1;
        int star = 1;
        
        while (one <= height){
            while (a<b){
                System.out.print(" ");
                a +=1;
            }a = 1;
            while (a<=star){
                System.out.print("*");
                a +=1;
            }System.out.println("");
            a = 1;
            one += 1;
            star +=2;
            b -=1;
        }
    
        int aBase = 1;
        int bBase = height + 2;
        int cBase = 1;
        while (cBase<=2){
            while (aBase<height-1){
                System.out.print(" ");
                aBase +=1;
            }aBase=1;
            while (aBase <4){
                System.out.print("*");
                aBase += 1;
            }aBase=1;
            System.out.println("");
            cBase +=1;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(3);
        System.out.println("---");
        printSpaces(3);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
