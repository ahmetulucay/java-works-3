
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        int i =0;
        for (String counter : this.meals) { 		      
            if (counter.equals(meal)){
                i+=1;
                break;
            }
        }
        if (i == 0){
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String counter : this.meals) {
            System.out.println(counter);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
