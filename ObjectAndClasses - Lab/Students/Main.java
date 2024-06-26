package ObjectAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //Създаваме един празен списък с ученици
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")){

            String[] currentData = input.split(" ");

            //прочитаме конкретните елементи от масива
            String firstName = currentData[0];
            String lastName = currentData[1];
            int age = Integer.parseInt(currentData[2]);
            String homeTown = currentData[3];

            //създаваме обект от клас Student -> firstName, lastName, age, homeTown
            Student currentStudent = new Student(firstName, lastName, age, homeTown);

            //към списъка с ученици добавяме нашия текущ ученик
            students.add(currentStudent);

            input = scanner.nextLine();
        }

        String filterTown = scanner.nextLine();

        for (Student student : students){

            if (student.getHometown().equals(filterTown)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }
}
