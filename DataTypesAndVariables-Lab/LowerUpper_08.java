package DataTypesAndVariables;

import java.util.Scanner;

public class LowerUpper_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);

        int asciiNumber = (int) letter;

       /* if(letter >= 65 && letter <= 90){
            System.out.println("upper-case");
        }else if(letter >= 97 && letter <= 122){
            System.out.println("lower-case");
        }*/
        if(asciiNumber >= 65 && asciiNumber <= 90){
            System.out.println("upper-case");
        }else if(asciiNumber >= 97 && asciiNumber <= 122){
            System.out.println("lower-case");
        }

    }
}
