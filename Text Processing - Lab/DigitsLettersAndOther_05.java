package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentCharacter = input.charAt(i);

            if(Character.isDigit(currentCharacter)){
                digits.append(currentCharacter);
            } else if (Character.isAlphabetic(currentCharacter)) {
                letters.append(currentCharacter);
            }else {
                others.append(currentCharacter);
            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
