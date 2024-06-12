package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //факториел на първото число (firstNumber)
        long factorialFirstNumber = calculateFactorial(firstNumber);

        //факториел на второто число (secondNumber)
        long factorialSecondNumber = calculateFactorial(secondNumber);

        //резултат
        double result = factorialFirstNumber * 1.0 / factorialSecondNumber;

        //отпечаваме
        System.out.printf("%.2f", result);
    }

    //метод, който изчислява и връща факториела на едно число
    public static long calculateFactorial (int number) {
        //number = 7
        //7! = 1 * 2 * 3 * 4 * 5 * 6 * 7

        long fact = 1; //стойността на факториел
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
