package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);

    }

    public static void printCharactersInRange (char firstSymbol, char secondSymbol) {
        //започваме със символа, който е с по-малък аски код
        if (firstSymbol < secondSymbol) {
            //започваме от firstSymbol -> приключваме в secondSymbol
            for (int ascii = firstSymbol + 1; ascii < secondSymbol; ascii++) {
                System.out.print((char)ascii + " ");
            }
        } else { //firstSymbol >= secondSymbol
            //започваме от secondSymbol -> приключваме в firstSymbol
            for (char symbol = (char)(secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
