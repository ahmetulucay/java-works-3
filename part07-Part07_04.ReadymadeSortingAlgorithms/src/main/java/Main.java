
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] t = {2, 1, 3, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
        sort(t);
        System.out.println(Arrays.toString(t));
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("France");
        countryList.add("USA");
        countryList.add("India");
        countryList.add("Spain");
        countryList.add("England");
        System.out.println(countryList.toString());
    }

    public static void sort(int[] array){ //that sorts an array of integers.
        Arrays.sort(array);    }
 
    public static void sort(String[] array){ //that sorts an array of strings.
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){ //that sorts a list of integers.
        Collections.sort(integers);
    }
 
    public static void sortStrings(ArrayList<String> strings){ //that sorts a list of strings.
        Collections.sort(strings);
    }

}
