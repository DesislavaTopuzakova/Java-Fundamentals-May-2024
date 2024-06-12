package Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //"DESISLAVA".toLowerCase() -> "desislava"

        int countVowels = getVowelsCount(text);
        System.out.println(countVowels);
    }

    //метод, който връща като резултат брой на гласните букви
    public static int getVowelsCount (String text) {
        int count = 0; //брой на гласните букви
        //"Softuni".toCharArray() -> ['S', 'o', 'f', 't', 'u', 'n', 'i']
        //малки гласни букви: а, е, о, u, i

        for (char symbol : text.toLowerCase().toCharArray()) {
            //проверка за малка гласна буква
            switch (symbol) {
                case 'a', 'e', 'o', 'u', 'i' -> count++;
            }
        }

        return count;
    }
}
