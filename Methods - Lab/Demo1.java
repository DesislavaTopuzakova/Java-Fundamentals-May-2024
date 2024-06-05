package Methods;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        printHeaderPart();

        //Средна част на касовата бележка ->Продукти (артикули) - цената за всеки артикул, общата сума
        int countCourses = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        printMiddlePart(countCourses, scanner, totalPrice);


        printFooterPart();




    }



    //Когато създаваме метод
    //1. {public/private} - access modifiers (модификатори на достъп)

    //2. static - можем да извикваме метода директно с неговото име в класа, в който го създаваме

    //3. Тип на метода - бива 2 вида - void

    //4. Името на метода - името трябва да бъде максимално говорящо, да отговаря на въпроса какво прави този метод

    //5. () - записваме параметри, с които ще работим

    //6. {} - мястото където ще пишем кодът, който искаме да се изпълни

    public static void printHeaderPart () {
        //Горна част на касовата бележка -> издател(Име на Фирмата), адрес
        System.out.println("SoftUni OOD, Aleksandar Malinov 78");
    }

    private static void printMiddlePart(int countCourses, Scanner scanner, double totalPrice) {
        for (int i = 1; i <= countCourses; i++) {
            String courseName = scanner.nextLine();
            double coursePrice = Double.parseDouble(scanner.nextLine());
            totalPrice = totalPrice + coursePrice;
            System.out.printf("%s: %.2flv.%n", courseName, coursePrice);
        }

        System.out.println(totalPrice);
    }

    public static void printFooterPart () {
        //Долна част на касовата бележка -> час и дата
        System.out.println("05-June-2024  18:42");

    }



    
}
