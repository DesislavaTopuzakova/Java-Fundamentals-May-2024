package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");


        for (String word : input){

           /* for (int i = 0; i < word.length(); i++) {

                System.out.print(word);

            }*/

            System.out.print(word.repeat(word.length()));
        }
    }
}
