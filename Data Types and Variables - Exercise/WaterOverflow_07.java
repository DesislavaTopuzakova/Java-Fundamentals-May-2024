package DataTypes_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine()); //брой наливания
        int totalLiters = 0; //литри във варела

        for (int pour = 1; pour <= count; pour++) { //всяко наливане
            int pouredLiters = Integer.parseInt(scanner.nextLine()); //наляти литри
            //наливаме
            totalLiters += pouredLiters;

            //проверка дали сме преляли
            if (totalLiters > 255) {
                //преливане
                System.out.println("Insufficient capacity!");
                //изваждаме налятите литри, които преливат
                totalLiters -= pouredLiters;
            }

        }

        //след всички наливания
        System.out.println(totalLiters);
    }
}
