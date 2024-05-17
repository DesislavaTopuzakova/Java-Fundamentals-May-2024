package BasicsRecap_Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int lostGamesCount = Integer.parseInt(scanner.nextLine()); //брой загубени игри
        double headsetPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 чифт слушалки
        double mousePrice = Double.parseDouble(scanner.nextLine()); //цена за 1 мишка
        double keyboardPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 клавиатура
        double displayPrice = Double.parseDouble(scanner.nextLine()); //цена за 1 монитор

        //2. брой артикули от всеки вид
        int headsetCount = lostGamesCount / 2; //брой счупени слушалки
        int mouseCount = lostGamesCount / 3; //брой на счупени мишки
        int keyboardCount = lostGamesCount / 6; //брой на счупени клавиатури
        int displayCount = lostGamesCount / 12; //брой на счупени монитори

        //3. общата цена = цена за слушалки + цена за мишките + цена за клавиатури + цена за мониторите
        double totalPrice = (headsetCount * headsetPrice)
                            + (mouseCount * mousePrice)
                            + (keyboardCount * keyboardPrice)
                            + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
