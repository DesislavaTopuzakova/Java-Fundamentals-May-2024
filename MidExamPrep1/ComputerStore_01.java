package MidExamPrep1;

import java.util.Scanner;

public class ComputerStore_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double priceWithoutTaxes = 0;
        double taxes = 0;

        //Създаваме си while цикъл докато не получим команда special or regular
        while (!command.equals("special") && !command.equals("regular")){
            //превръщаме прочетения стринг в double -> това ще бъде цената за един компонент
            double currentPrice = Double.parseDouble(command);

            //проверяваме ако цената е отрицателно число -> принтираме "Invalid price" -> продължаваме да четем от конзолата
            if(currentPrice < 0){
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }

            //добавяме текущата цена към общата сума без такси
            priceWithoutTaxes += currentPrice;

            //пресмятаме и добавяме таксата за текущата покупка
            taxes += currentPrice * 0.20;

            command = scanner.nextLine();
        }

        //пресметнем колко е общата сума за всички компоненти + такси
        double totalSum = priceWithoutTaxes + taxes;

        //проверяваме дали клиентът е special -> пресмятаме 10% отстъпка
        if(command.equals("special")){
            totalSum = totalSum * 0.9;
        }

        String finalText = String.format("Congratulations you've just bought a new computer!%n") +
                String.format("Price without taxes: %.2f$%n", priceWithoutTaxes) +
                String.format("Taxes: %.2f$%n", taxes) +
                String.format("-----------%n") +
                String.format("Total price: %.2f$", totalSum);


        //Congratulations you've just bought a new computer!
        //Price without taxes: {total price without taxes}$
        //Taxes: {total amount of taxes}$
        //-----------
        //Total price: {total price with taxes}$"

        //проверим дали общата сума е <= 0 -> принтираме "Invalid order"
        if(totalSum <= 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println(finalText);
            /*System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);*/

        }

    }
}
