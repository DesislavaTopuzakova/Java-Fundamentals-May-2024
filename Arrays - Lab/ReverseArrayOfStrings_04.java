package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {

            //[a, b, c, d, e]
            String temp = input[i];
            input[i] = input[(input.length - 1) - i];
            input[(input.length - 1) - i] = temp;

        }
        System.out.println(String.join(" ", input));
    }

}
