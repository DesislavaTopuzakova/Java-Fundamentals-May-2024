package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine() //"1 7 6 2 19 23"
                             .split(" ")) // ["1", "7", "6", "2", "19", "23"]
                             .mapToInt(Integer::parseInt).toArray(); //[1, 7, 6, 2, 19, 23]

        int number = Integer.parseInt(scanner.nextLine());

        //обхождаме всички елементи в масива
        for (int position = 0; position <= numbers.length - 1; position++) {
            int currentNumber = numbers[position];
            //обхождаме всички след него
            for (int nextPosition = position + 1; nextPosition <=  numbers.length - 1; nextPosition++) {
                    int nextNumber = numbers[nextPosition]; //число, което е след моето
                    //двойка числа: currentNumber  nextNumber
                    if (currentNumber + nextNumber == number) {
                        System.out.println(currentNumber + " " + nextNumber);
                    }
            }
        }
    }
}
