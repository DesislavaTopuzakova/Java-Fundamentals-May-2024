package Arrays;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int n = Integer.parseInt(scanner.nextLine());

        //Вариант 1 за запълване на масива
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/

        for (int num : numbers){
            System.out.println(num);
        }

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : days){
            System.out.println(day);
        }

        //Вариант 2 за запълване на масив

        int[] nums = new int[4];
        nums[0] = 2;
        //nums[1] = Integer.parseInt(scanner.nextLine());

        //Вариант 3 за запълване на масив
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int position = 0; position < array.length; position++) {

            array[position] = Integer.parseInt(scanner.nextLine());

        }

        /*String name = "Yuli";
        name.length();*/

        array[0] = 25;

        //Вариант 4 виж Demo 3


    }
}
