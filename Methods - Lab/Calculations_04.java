package Methods;

import java.util.Scanner;

public class Calculations_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //("add", "multiply", "subtract", "divide")

        switchByAction(action, firstNumber, secondNumber);




    }

    private static void switchByAction(String action, int firstNumber, int secondNumber) {
        switch (action){
            case "add" -> actionAdd(firstNumber, secondNumber);
            case "multiply" -> actionMultiply(firstNumber, secondNumber);
            case "subtract" -> actionSubtract(firstNumber, secondNumber);
            case "divide" -> actionDivide(firstNumber, secondNumber);
        }
    }

    public static void actionDivide (int firstNum, int secondNum){

        System.out.println(firstNum / secondNum);
    }

    private static void actionSubtract(int firstNumber, int secondNumber) {

        System.out.println(firstNumber - secondNumber);
    }

    private static void actionMultiply(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public static void actionAdd (int num1, int num2){

        System.out.println(num1 + num2);
    }


}
