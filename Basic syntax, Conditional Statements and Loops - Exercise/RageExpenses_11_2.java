package BasicsRecap_Exercise;

import java.util.Scanner;

public class RageExpenses_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int lostGamesCount = Integer.parseInt(scanner.nextLine()); //брой загубени игри
        double headsetPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 чифт слушалки
        double mousePrice = Double.parseDouble(scanner.nextLine()); //цена за 1 мишка
        double keyboardPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 клавиатура
        double displayPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 монитор

        //2. брой артикули от всеки вид
        int headsetCount = 0; //брой счупени слушалки
        int mouseCount = 0; //брой на счупени мишки
        int keyboardCount = 0; //брой на счупени клавиатури
        int displayCount = 0; //брой на счупени монитори

        for (int game = 1; game <= lostGamesCount; game++) {
            //всяка втора игра чупим слушалки
            if (game % 2 == 0) {
                headsetCount++;
            }
            //всяка трета игра чупим мишка
            if (game % 3 == 0) {
                mouseCount++;
            }
            //всяка шеста игра чупим клавиатура
            if (game % 6 == 0) {
                keyboardCount++;
            }
            //всяка дванадесета игра чупим монитор
            if (game % 12 == 0) {
                displayCount++;
            }
        }

        //3. общата цена = цена за слушалки + цена за мишките + цена за клавиатури + цена за мониторите
        double totalPrice = (headsetCount * headsetPrice)
                + (mouseCount * mousePrice)
                + (keyboardCount * keyboardPrice)
                + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
