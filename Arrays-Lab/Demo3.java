package Arrays;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Вариант 4 за прочитан на масив от конзолата -> масив, който е на 1 ред
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))// "12 14 15 16" -> ["12", "14", "15", "16"]
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        double[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        String[] collection = scanner.nextLine().split(" ");

        //Arrays.stream(collection).forEach(System.out::println);





    }
}
