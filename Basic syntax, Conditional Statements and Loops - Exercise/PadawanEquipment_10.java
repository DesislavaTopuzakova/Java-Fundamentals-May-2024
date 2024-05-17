package BasicsRecap_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        double budget = Double.parseDouble(scanner.nextLine()); //наличен бюджет
        int countStudents = Integer.parseInt(scanner.nextLine()); //брой на ученици / падавани
        double priceSaber = Double.parseDouble(scanner.nextLine()); //цена за 1 меч
        double priceRobe = Double.parseDouble(scanner.nextLine()); //цена за 1 роба
        double priceBelt = Double.parseDouble(scanner.nextLine()); //цена за 1 колан

        //2. по колко броя трябва да купим от всеки артикул (меч, роби, колани)
        double countSaber = Math.ceil(1.10 * countStudents); //брой мечове
         //брой роби == брой студенти
        int countBelts = countStudents - countStudents / 6;

        //3. oбщa сума за плащане = сума за колани + сума за мечове + сума за роби
        double totalSum = (priceBelt * countBelts)
                        + (priceSaber * countSaber)
                        + (priceRobe * countStudents);

        //4. проверка дали бюджетът е достатъчен
        if (budget >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double neededMoney = totalSum - budget; //нужни пари
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
