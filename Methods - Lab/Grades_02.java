package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());





        printGradeInWords(grade);
    }

    private static void printGradeInWords(double currentGrade) {

        //•	2.00 – 2.99 - "Fail"
        //•	3.00 – 3.49 - "Poor"
        //•	3.50 – 4.49 - "Good"
        //•	4.50 – 5.49 - "Very good"
        //•	5.50 – 6.00 - "Excellent"

        if(currentGrade >= 2 && currentGrade <= 2.99){
            System.out.println("Fail");
        } else if (currentGrade >= 3 && currentGrade <= 3.49) {
            System.out.println("Poor");
        } else if (currentGrade >= 3.50 && currentGrade <= 4.49) {
            System.out.println("Good");
        } else if (currentGrade >= 4.50 && currentGrade <= 5.49) {
            System.out.println("Very good");
        } else if (currentGrade >= 5.50 && currentGrade <= 6) {
            System.out.println("Excellent");
        }
    }
}
