package DataTypes_Exercise;

import java.util.Scanner;

public class PrintPartAcsii_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char) code + " ");
        }
    }
}
