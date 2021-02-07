
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        
        for (int a = 0; a<array.length-1;a++){
            System.out.print(array[a]+", ");
        }System.out.print(array[array.length-1]);
    }
}
