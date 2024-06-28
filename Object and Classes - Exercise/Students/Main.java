package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>(); //празен списък
        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countStudents; count++) {
            String personalData = scanner.nextLine();
            //"Lakia Eason 3.90".split(" ") -> ["Lakia", "Eason", "3.90"]
            String[] splitData = personalData.split(" "); //["Lakia", "Eason", "3.90"]
            String firstName = splitData[0];
            String lastName = splitData[1];
            double grade = Double.parseDouble(splitData[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        //лист със студенти

        //сортираме
        //ascending order -> нарастващ ред
        //descending order -> намаляващ ред
        studentList
                .sort(Comparator.comparingDouble(Student::getGrade) //ascending order
                .reversed()); //descending order

        //отпечатаме
        //"{first name} {last name}: {grade}"
        for (Student student : studentList) {
            //начин 1: отпечатване на обект -> достъпваме всички полета и ги отпечатваме
            //System.out.printf("%s %s: %.2f", student.getFirstName(), student.getLastName(), student.getGrade());

            //начин 2
            System.out.println(student.toString());
        }
    }
}
