package ObjectAndClasses.Students_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //Създаваме един празен списък с ученици
        List<Student_02> students = new ArrayList<>();

        while (!input.equals("end")){

            String[] currentData = input.split(" ");

            //прочитаме конкретните елементи от масива
            String firstName = currentData[0];
            String lastName = currentData[1];
            int age = Integer.parseInt(currentData[2]);
            String homeTown = currentData[3];

            //вземаме обект от списъка с ученици
            Student_02 currentStudent = getExistingStudent(students, firstName, lastName);

            if(currentStudent != null){
                currentStudent.setAge(age);
                currentStudent.setHometown(homeTown);
            }else {
                //към списъка с ученици добавяме нашия текущ ученик
                currentStudent = new Student_02(firstName, lastName, age, homeTown);
                students.add(currentStudent);
            }






            input = scanner.nextLine();
        }

        String filterTown = scanner.nextLine();

        for (Student_02 student : students){

            if (student.getHometown().equals(filterTown)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }



    private static Student_02 getExistingStudent(List<Student_02> students, String firstName, String lastName) {

        for (Student_02 student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return student;
            }

        }

        return null;
    }
}
