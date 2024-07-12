import java.util.Scanner;

public class CaeserCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни -> текст
        String text = scanner.nextLine(); //"Programming is cool!"
        StringBuilder encryptedText = new StringBuilder(); //[] -> съхраняваме криптирания текст

        //криптиране
        for (char symbol : text.toCharArray()) {
            //'A' 65 -> 'D' 68
            char encryptSymbol = (char) (symbol + 3);
            encryptedText.append(encryptSymbol);
        }

        //криптирания текст
        System.out.println(encryptedText);
    }
}
