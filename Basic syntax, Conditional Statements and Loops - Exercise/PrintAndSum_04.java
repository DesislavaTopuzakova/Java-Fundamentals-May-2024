package BasicsRecap_Exercise;


import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int startNumber = Integer.parseInt(scanner.nextLine()); //числото, което е началото на интервала
        int endNumber = Integer.parseInt(scanner.nextLine()); //числото, което е краят на интервала

        //2. отпечатване на числата
        //FOR цикъл
        //повтаряме: отпечатваме числото -> отпечатваме интервал -> добавям към общата сума
        //начало: startNumber
        //край: endNumber
        //промяна: +1
        int sum = 0; //сума на числата
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum = sum + number; //sum += number;
        }
        //3. отпечатване на сумата
        System.out.println(); //премнава на нов ред
        System.out.println("Sum: " + sum);
    }
}
