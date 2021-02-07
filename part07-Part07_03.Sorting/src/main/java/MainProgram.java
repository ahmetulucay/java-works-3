
import java.util.Arrays;
import java.util.Collections;


public class MainProgram {

    public static void main(String[] args) {
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        /*
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of Smallest: " + MainProgram.indexOfSmallest(array));
        System.out.println("");
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        */
        //System.out.println("");
        //MainProgram.swap(array, 1, 0);
        //System.out.println(Arrays.toString(array));
        //MainProgram.swap(array, 0, 3);
        //System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array){
        int smallest=array[0];
        for (int a=0;a<array.length;a++){
            if (array[a]<=smallest){
                smallest=array[a];
            }
        }return smallest;
    }
    
    public static int indexOfSmallest(int[]array){
        int smallestIndex=0;
        for (int a=0;a<array.length;a++){
            if (array[a]==MainProgram.smallest(array)){
                smallestIndex=a;
            }
        }return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest=table[startIndex];
        int smallestFrom=0;
                
        for (int a=startIndex;a<table.length;a++){
            if (table[a]<=smallest){
                smallest=table[a];
                smallestFrom=a;
            }
        }return smallestFrom;
    }
    
    public static void swap(int[]array, int index1, int index2){
        int swapNo=array[index1];
        array[index1]=array[index2];
        array[index2]=swapNo;
    }  
    
    public static void sort(int[] array) {
        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, startIndex);
            if (smallestIndex==startIndex){
                continue;
            }else{
                System.out.println(Arrays.toString(array));
                MainProgram.swap(array, smallestIndex, startIndex);
            }
        }System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
    }
}
