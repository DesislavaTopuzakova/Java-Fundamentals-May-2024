package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine(); //ключ за активация
        String command = scanner.nextLine(); //команди, които трябва да изпълним върху нашия activationKey

        while (!command.equals("Generate")) {
            //валидна команда, която трябва да изпълним
            String [] commandParts = command.split(">>>");
            String commandName = commandParts[0]; //"Contains", "Flip", "Slice"

            int startPosition = 0;
            int endPosition = 0;

            switch (commandName) {
                case "Contains":
                    //command = "Contains>>>table".split -> commandParts = ["Contains", "table"]
                    String textForChecking = commandParts[1]; //текст, който трябва да го проверим дали го има в ключа за активация
                    //1. textForChecking се съдържа в activationKey
                    if (activationKey.contains(textForChecking)) {
                        System.out.printf("%s contains %s%n", activationKey, textForChecking);
                    }
                    //2. textForChecking НЕ СЕ съдържа в activationKey
                    else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    //command = "Flip>>>Upper>>>1>>>3".split -> commandParts = ["Flip", "Upper", "{startIndex}", "{endIndex}"]
                    //command = "Flip>>>Lower>>>1>>>3".split -> commandParts = ["Flip", "Lower", "{startIndex}", "{endIndex}"]
                    String type = commandParts[1]; //"Upper" или "Lower"
                    startPosition = Integer.parseInt(commandParts[2]);
                    endPosition = Integer.parseInt(commandParts[3]);
                    //1. взимаме текста между дадените позиции -> текст, който ще заменяме
                    String textForReplace = activationKey.substring(startPosition, endPosition); //текст, който трябва да заменим
                    //2. променяме текста спрямо type на командата
                    String replacement = ""; //текст заместител
                    if (type.equals("Upper")) {
                        replacement = textForReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        replacement = textForReplace.toLowerCase();
                    }
                    //3. заменяме textForReplace с replacement
                    activationKey = activationKey.replace(textForReplace, replacement);
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    //command = "Slice>>>2>>>6".split -> commandParts = ["Slice", "2", "6"]
                    startPosition = Integer.parseInt(commandParts[1]); //"2" -> parse -> 2
                    endPosition = Integer.parseInt(commandParts[2]); // "6" -> parse -> 6

                    //изтривам всички символи от startPosition до endPosition (не е вкл.) на activationKey
                    //String -> няма лесна опция за премахване на елементи от него!

                    //начин 1: със StringBuilder
                    /*StringBuilder sb = new StringBuilder(activationKey);
                    sb.delete(startPosition, endPosition);
                    //sb.toString() -> си държа новата версия на ключа за активация с изтритите букви
                    activationKey = sb.toString();
                    System.out.println(activationKey);*/

                    //начин 2: със substring
                    String textForDelete = activationKey.substring(startPosition, endPosition);
                    activationKey = activationKey.replace(textForDelete, "");
                    System.out.println(activationKey);

                    break;
            }


            command = scanner.nextLine();
        }

        //отпечатваме ключа за активация след изпълнението на всички команди върху него
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
