/*
 * This program will prompt user for 5 grades, store those grades, get an average
 *grade and convert each grade and the average to a letter grade.
 */
package Assignment1new;

import java.util.Scanner;

/**
 *
 * @author Allie
 */
public class AverageGrade {
    public static void main (String [] args){
        double grade1, grade2, grade3, grade4, grade5;
        String letterGrade1 = null, letterGrade2 = null, letterGrade3 = null, letterGrade4 = null, letterGrade5 = null;
        
        
        
        System.out.print("This program will calculate the average of five grades and convert them tp letters grades. \nEnter your grades in numeric form. I.e. 87 not eighty seven. \n");
        
        grade1= getGrade();
        grade2= getGrade();
        grade3= getGrade();
        grade4= getGrade();
        grade5= getGrade();
        
        letterGrade1= getLetterGrade(grade1, letterGrade1);
        letterGrade2= getLetterGrade(grade2, letterGrade2);
        letterGrade3= getLetterGrade(grade3, letterGrade3);
        letterGrade3= getLetterGrade(grade4, letterGrade4);
        letterGrade3= getLetterGrade(grade5, letterGrade5);
        
        System.out.printf("The average grade is %.1f", getAverage(grade1,grade2,grade3,grade4,grade5));
        System.out.printf("In the first course, you earned a mark of %d, which is a grade of %s%n", grade1, letterGrade1);
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
     public static String getLetterGrade(double g, String letterGrade1){
       
         if (g >= 80.0){
           letterGrade1 = "A";
         }
         else if (g >= 70.0){
           letterGrade1 = "B";
         }
         else if (g >= 60.0){
           letterGrade1 = "C";
         }
         else if (g >= 50.0){
           letterGrade1 = "D";
         }
         else {
           letterGrade1 = "F";
         }
        
         return letterGrade1;
     }
}
