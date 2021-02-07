
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int a = 0;a<array.length;a++){
            int c = array[a];
            for (int b = 0;b<c; b++){
                System.out.print("*");
            }System.out.println("");
        }
    }

}
