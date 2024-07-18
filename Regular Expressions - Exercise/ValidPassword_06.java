package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPassword = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regexPassword);

        int countPasswords = Integer.parseInt(scanner.nextLine()); //брой пароли
        for (int count = 1; count <= countPasswords; count++) {
            String password = scanner.nextLine();
            //1. проверка дали е валидна паролата
            Matcher matcher = pattern.matcher(password);
            //matcher -> съвкупност от всички текстове, които отговарят на шаблона
            //вариант 1: matcher = [] -> невалидна парола
            //вариант 2: matcher = ["_...ChelseA_."]

            if (matcher.find()) {
                //matcher.find() -> "_...ChelseA_."
                //имаме валидна парола -> категоризирам
                String passwordText = matcher.group("passwordText"); //"ChelseA"
                //2. категоризация на паролата
                StringBuilder sbDigits = new StringBuilder(); //долепям намерените цифри в паролата
                for (char symbol : passwordText.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        //текущия символ е цифра
                        sbDigits.append(symbol);
                    }
                }

                //sbDigits -> долепени всички цифири от паролата
                //1. нямаме цифри в паролата -> група default
                if (sbDigits.isEmpty()) { //sbDigits.length() == 0
                    System.out.println("Group: default");
                }
                //2. имаме цифри в паролата
                else { //sbDigits.length() != 0
                    System.out.println("Group: " + sbDigits);
                }
            } else {
                //matcher.find() == false -> matcher = [] -> невалидна парола
                System.out.println("Invalid pass!");
            }
        }
    }
}
