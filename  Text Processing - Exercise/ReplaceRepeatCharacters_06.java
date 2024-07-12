import java.util.Scanner;

public class ReplaceRepeatCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text); //"abcdddeeeedssaa" -> лесна модификация

        for (int position = 0; position < textBuilder.length() - 1; position++) {
            //обхождаме всички символи без последния -> няма как след него да има повтарящ се символ
            if (textBuilder.charAt(position) == textBuilder.charAt(position + 1)) {
                textBuilder.deleteCharAt(position + 1); //премахваме повтарящия се символ след моя
                position--; //връщаме се на нашия символ
            }
        }

        System.out.println(textBuilder);



    }
}
