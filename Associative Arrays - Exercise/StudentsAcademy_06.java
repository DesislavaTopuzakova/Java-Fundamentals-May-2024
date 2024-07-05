package maps;

import java.util.*;

public class StudentsAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //студент -> лист от оценки
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine()); //брой на студенти
        for (int count = 1; count <= countStudents; count++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            //1. имаме вече такъв записан студент
            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            }
            //2. нямаме все още такъв записан студент
            else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }

        //studentsGrade: име на студента -> списък с оценки

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry
            //entry.getKey() -> име на студента
            //entry.getValue() -> списък с оценки
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", studentName, averageGrade);
            }
        }
    }

    //метод, който приема списък с оценки и връща средната оценка
    private static double getAverageGrade(List<Double> grades) {
        //{5, 4, 6, 3}
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
