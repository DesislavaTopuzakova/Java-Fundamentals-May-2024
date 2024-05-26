package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        //Начин 1
        //System.out.println(firstName + delimiter + secondName);

        //Начин 2
        System.out.printf("%s%s%s", firstName, delimiter, secondName);
    }
}
