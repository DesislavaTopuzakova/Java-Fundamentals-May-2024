
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // String [] input = scanner.nextLine().split(" "); //["2", "3", "4"]

        /*int [] numbers = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();*/


        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 0)
                .toArray();



    }
}
