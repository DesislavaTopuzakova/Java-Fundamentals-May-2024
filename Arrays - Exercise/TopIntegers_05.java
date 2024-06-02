package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int [] numbers = Arrays.stream(scanner.nextLine()
                       .split(" "))
                       .mapToInt(Integer::parseInt).toArray();

        for (int position = 0; position <= numbers.length - 1; position++) {

            //винаги последното число е топ -> отпечатваме го
            if (position == numbers.length - 1) {
                //последното число
                System.out.print(numbers[position]);
                break;
            }

            //останалите числа
            int currentNumber = numbers[position];
            //проверка дали е топ число
            boolean isTop = true;
            //isTop = true -> числото ми е топ
            //isTop = false -> числото ми не е топ

            //обхождаме всички позиции след моята
            for (int nextPosition = position + 1; nextPosition <= numbers.length - 1; nextPosition++) {
                int nextNumber = numbers[nextPosition]; //числа, след моето
                if (currentNumber <= nextNumber) {
                    //не е топ
                    isTop = false;
                    break;
                }
            }

            //знам дали числото е топ или не
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }

    }
}
