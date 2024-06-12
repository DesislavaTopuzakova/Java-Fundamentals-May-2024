package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);

    }

    //метод, който принтира средния символ
    public static void printMiddleCharacter (String text) {
        int length = text.length(); //дължина = брой символи
        //нечетна дължина -> 1 среден символ
        if (length % 2 != 0) {
            //"aString" 7 символа -> 'r' 3 позиция
            //"Pesho" 5 символа -> 's' 2 позиция
            //"Pes" 3 символа -> 'е' 1 позиция
            int positionMiddleSymbol = length / 2;
            //позиция на средния символ при нечетна дължина
            System.out.println(text.charAt(positionMiddleSymbol));
        }
        //четна дължина -> 2 средни символа
        else {
            //"tables" 6 символа -> b (2 позиция) и l (3 позиция)
            //"Desi" 4 символа -> е (1 позиция) и s (2 позиция)
            int positionFirstMiddleCharacter = length / 2 - 1; //позиция на първия среден символ
            int positionSecondMiddleCharacter = length / 2; //позиция на втория среден символ

            System.out.print(text.charAt(positionFirstMiddleCharacter));
            System.out.print(text.charAt(positionSecondMiddleCharacter));
        }
    }
}
