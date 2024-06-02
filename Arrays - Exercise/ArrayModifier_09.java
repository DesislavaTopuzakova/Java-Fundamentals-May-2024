package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine()
                                 .split(" "))
                                 .mapToInt(Integer::parseInt).toArray();
        //numbers = [23, -2, 321, 87, 42, 90, -123]

        //повтаряме: въвеждаме команди
        //стоп: въведена командата end
        //продължаваме: въведената команда не е end

        String command = scanner.nextLine(); //въведената команда
        while (!command.equals("end")) {
            //command != "end" -> валидна команда
            if (command.contains("swap")) {
                //размяна
                //1. command = "swap 1 3".split(" ") -> ["swap", "1", "3"]
                //взимаме позициите на числата, които трябва да разменим
                int positionFirstNumber = Integer.parseInt(command.split(" ")[1]); //1
                int positionSecondNumber = Integer.parseInt(command.split(" ")[2]); //3

                //взимаме числата от позициите, които ще разменяме
                int firstNumber = numbers[positionFirstNumber]; //-2
                int secondNumber = numbers[positionSecondNumber]; //87

                //осъществяваме размяната
                numbers[positionFirstNumber] = secondNumber;
                numbers[positionSecondNumber] = firstNumber;

            } else if (command.contains("multiply")) {
                //2. command = "multiply 2 4".split(" ") -> ["multiply", "2", "4"]
                //взимаме позициите на числата, които ще умножаваме
                int positionFirstNumber = Integer.parseInt(command.split(" ")[1]); //2
                int positionSecondNumber = Integer.parseInt(command.split(" ")[2]); //4

                //взимаме числата от позициите, които ще умножаваме
                int firstNumberForMultiply = numbers[positionFirstNumber];
                int secondNumberForMultiply = numbers[positionSecondNumber];

                //умножаване
                int product = firstNumberForMultiply * secondNumberForMultiply;
                numbers[positionFirstNumber] = product;
            } else if (command.equals("decrease")) {
                //3. command = "decrease"
                //обходим всички елементи -> -1
                for (int position = 0; position <= numbers.length - 1; position++) {
                    //1 начин
                    numbers[position]--;
                    //2 начин
                    //numbers[position] -= 1;
                    //3 начин
                    //numbers[position] = numbers[position] - 1;
                }
            }

            command = scanner.nextLine();
        }

        //отпечатваме числата разделени с ", "
        //начин 1
        //numbers = [23, -2, 321, 87, 42, 90, -123]
        for (int position = 0; position <= numbers.length - 1; position++) {
            int currentNumber = numbers[position];
            if (position != numbers.length - 1) {
                //числото ни не е последно
                System.out.print(currentNumber + ", ");
            } else {
                //position == numbers.length - 1
                //числото ни е последно
                System.out.print(currentNumber);
            }
        }

    }
}
