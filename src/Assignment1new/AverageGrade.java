/*
 * This program will prompt user for 5 grades, store those grades, get an average
 *grade and convert each grade and the average to a letter grade.
 */
package Assignment1new;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Allie
 */
public class AverageGrade {
    public static void main (String [] args){
        double grade1, grade2, grade3, grade4, grade5, avgGrade;
        String letterGrade1, letterGrade2, letterGrade3, letterGrade4, letterGrade5;
        String letterGradeAvg;
        
        
        
        System.out.print("This program will calculate the average of five grades and convert them to letters grades. \nEnter your grades in numeric form. I.e. 87 not eighty seven. \n");
        
        grade1= getGrade();
        grade2= getGrade();
        grade3= getGrade();
        grade4= getGrade();
        grade5= getGrade();
        
        avgGrade= getAverage(grade1,grade2,grade3,grade4,grade5);
        
        letterGrade1= getLetterGrade(grade1);
        letterGrade2= getLetterGrade(grade2);
        letterGrade3= getLetterGrade(grade3);
        letterGrade4= getLetterGrade(grade4);
        letterGrade5= getLetterGrade(grade5);
        letterGradeAvg= getLetterGrade(avgGrade);
        
        System.out.println(letterGrade1);
        System.out.printf("In the first course, you earned a mark of %.1f, which is a grade of %s%n", grade1, letterGrade1);
        System.out.printf("In the second course, you earned a mark of %.1f, which is a grade of %s%n", grade2, letterGrade2);
        System.out.printf("In the third course, you earned a mark of %.1f, which is a grade of %s%n", grade3, letterGrade3);
        System.out.printf("In the fourth course, you earned a mark of %.1f, which is a grade of %s%n", grade4, letterGrade4);
        System.out.printf("In the fifth course, you earned a mark of %.1f, which is a grade of %s%n", grade5, letterGrade5);
        System.out.printf("Overall, you earned a mark of %.1f, which is a grade of %s%n", avgGrade, letterGradeAvg);
        System.out.printf("The average grade is %.1f", getAverage(grade1,grade2,grade3,grade4,grade5));
    }
        //This method will prompt user for grade and return the value as a double
     public static double getGrade(){
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Please enter a grade");
         return keyboard.nextDouble();
     }
     public static double getAverage(double g1, double g2, double g3, double g4, double g5){
         return (g1+g2+g3+g4+g5)/5;
     }
     public static String getLetterGrade(double g){
       
         if (g >= 80.0){
           return "A";
         }
         else if (g >= 70.0){
           return "B";
         }
         else if (g >= 60.0){
           return "C";
         }
         else if (g >= 50.0){
           return "D";
         }
         else {
           return "F";
         }
        
     }
}
