
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradeBasedList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradeBasedList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradeBasedList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    public double averageOfGrades(){
        int totalGrades=0;
        if (this.grades.isEmpty()){
            return -1;
        }
        for (int a=0;a<this.grades.size();a++) {
            totalGrades+=this.grades.get(a);
        }
        double averageOf = (double)totalGrades/this.grades.size();
        return averageOf;
    }
    
    public double averageOfPoints(){
        int totalGradesOfPoints=0;
        if (this.gradeBasedList.isEmpty()){
            return -1;
        }        
        for (int a=0;a<this.gradeBasedList.size();a++) {
            totalGradesOfPoints+=this.gradeBasedList.get(a);
        }
        double averageOfPoints = (double)totalGradesOfPoints/this.gradeBasedList.size();
        return averageOfPoints;
    }
}
