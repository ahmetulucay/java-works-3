
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grades puan=new Grades();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops: ");
        while(true){            
            int point = Integer.valueOf(scan.nextLine());
            if (point ==-1){
                break;
            }
            puan.addPoint(point);           
            }
        if (puan.listSize()>0){
            System.out.println("Point average (all): " + puan.pointAverage());
        }else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Point average (passing): " + puan.gecPointAverage());
        System.out.println("Pass percentage: " + puan.gecPointPercent());
        puan.addGrade();
        puan.gradesStars();
        
    }
}