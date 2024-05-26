package DataTypes_Exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte countKegs = Byte.parseByte(scanner.nextLine()); //брой на кегове: [1; 10]
        String maxModel = ""; //моделът на най-големия кег
        double maxVolume = 0; //стойността на най-големия кег

        //1. обходим всички кегове
        // - модел, radius, height
        // - намираме обем

        for (int keg = 1; keg <= countKegs; keg++) {
            //информация за кег
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //обем на кег: π * r^2 * h.
            double volume = Math.PI * Math.pow(radius, 2) * height;

            //проверка дали е най-голям
            if (volume > maxVolume) {
                maxModel = model;
                maxVolume = volume;
            }
        }

        //всички кегове -> отпечатваме модела на най-големия
        System.out.println(maxModel);

    }
}
