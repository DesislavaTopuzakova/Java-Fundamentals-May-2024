package Arrays;

public class Demo1 {

    public static void main(String[] args) {


        int[] numbers = new int[4];//[0, 0, 0, 0]

        numbers[0] = 22; //[22, 0, 0, 0]
        numbers[1] = 13; //[22, 13, 0, 0]
        numbers[2] = 6; //[22, 13, 6, 0]
        numbers[3] = 100; //[22, 13, 6, 100]

        int sumOfFirstAndLastElement = numbers[0] + numbers[numbers.length - 1];

        //System.out.println(numbers.length); // numbers.length -> получаваме дължината на масива
        //System.out.println(numbers[numbers.length - 1]); // принтираме последния елемент от масива


        //String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String[] daysOfWeek = new String[7];

        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";

        daysOfWeek[6] = "Sunday";

        String name = "Petyr";

        System.out.println(name.charAt(0));

        char[] letters = name.toCharArray();

        System.out.printf("%d%n", numbers[0]);

        System.out.printf("%s%n", daysOfWeek[1]);

        System.out.printf("%c%n", letters[letters.length - 1]);


    }
}
