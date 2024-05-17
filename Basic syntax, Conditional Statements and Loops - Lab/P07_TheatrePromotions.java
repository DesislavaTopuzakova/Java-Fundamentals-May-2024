package ProgramingBasicsOverview;

import java.util.Scanner;

public class P07_TheatrePromotions {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (dayType) {
            case "Weekday" -> {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }
            }
            case "Weekend" -> {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                }
            }
            case "Holiday" -> {

                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
            }
        }

        if(price != 0){
            System.out.printf("%.0f$", price);
        }else {
            System.out.println("Error!");
        }
    }
}
