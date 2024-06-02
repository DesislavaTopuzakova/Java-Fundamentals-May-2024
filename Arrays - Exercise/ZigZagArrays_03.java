package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine()); //брой редове с числа
        int [] firstArray = new int[n];
        int [] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine(); //"2 5"
            String[] numbers = input.split(" "); //["2", "5"]
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);

            if (row % 2 != 0) {
                //нечетен ред: firstNumber -> firstArray; secondNumber -> secondArray
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            } else {
                //четен ред: firstNumber -> secondArray; secondNumber -> firstArray
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;

            }
        }

        //отпечатваме масивите
        //отпечатваме firstArray = [4, 67, 89, 23]
        //обхождане
        //for -> работим с позициите
        //foreach -> само работа с елемените
        for (int position = 0; position < firstArray.length; position++) {
            System.out.print(firstArray[position] + " ");
        }

        System.out.println();//преминаваме на нов ред

        //отпечатваме secondArray = [9, 28, 45, 36]
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
