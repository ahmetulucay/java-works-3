
import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    //private ArrayList<String> completedExercises;
    
    public ExerciseManagement(){
        this.exercises=new ArrayList<>();
        //this.completedExercises=new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        //return this.exercises;
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises){
            list.add(exercise.getName());
        }
        return list;
    }    
    
    public void add(String exercisea){
        this.exercises.add(new Exercise(exercisea));
    }
    
    public void markAsCompleted(String exercise){
        for (Exercise ex : exercises){
            if (ex.getName().equals(exercise)){
                ex.setCompleted(true);
            }
        }
        //this.completedExercises.add(exercise);
    }
    
    public boolean isCompleted(String exercise){
        //return this.completedExercises.contains(exercise);
        for (Exercise ex : exercises){
            if (ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }

}
