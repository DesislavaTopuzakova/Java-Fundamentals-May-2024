package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        /*for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

            if(currentNumber % 2 == 0){
                sum += numbers[i];
            }

        }*/

        for (int num : numbers){

            if(num % 2 == 0){
                sum += num;
            }

        }

        System.out.println(sum);
    }
}
