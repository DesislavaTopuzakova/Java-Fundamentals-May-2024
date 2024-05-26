package DataTypes_Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0; //сума от цифрите

        //while
        //стоп: числото няма цифри (число <= 0)
        //продължавам: числото има цифри (число > 0)

        while (number > 0) {
            //1. последна цифра
            int lastDigit = number % 10;
            //2. сумираме
            sum = sum + lastDigit; //sum += lastDigit;
            //3. премахваме
            number = number / 10; //number /= 10;
        }
        System.out.println(sum);
    }
}
