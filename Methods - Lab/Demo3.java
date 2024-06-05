package Methods;

import java.util.Scanner;

import static Methods.Calculations_04.actionDivide;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());


        double result = actionDivideNumbers(firstNumber, secondNumber);

        System.out.println(result);*/

        int age = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());

        print(age);
        print(text);
        print(grade);

        System.out.println(3.14);


    }

    public static void print (double grade){
        System.out.println(grade);
    }

    public static void print(int age){
        System.out.println(age);
    }

    public static void print(String text){
        System.out.println(text);
    }



    private static double actionDivideNumbers(double firstNumber, double secondNumber) {

        double result = firstNumber / secondNumber;

        return result;
    }




}
