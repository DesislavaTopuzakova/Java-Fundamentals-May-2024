import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine() //"sh, too_long_username, !lleg@l ch@rs, jeffbutt"
                                .split(", "); //["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]


        for (String username : usernames) {
            //проверка да е валидно -> print
            //1. валидна дължина -> между 3 и 16 символа вкл.
            //2. валидно съдържание -> букви, цифри, -, _
            boolean lengthCheck = isValidLength(username);
            boolean contentCheck = isValidContent(username);
            if (lengthCheck && contentCheck) {
                //валидно
                System.out.println(username);
            }
        }
    }

    //метод, който проверява дали потребителското име е с валидна дължина
    //true -> ако е с валидна дължина
    //false -> ако не е с валидна дължина
    public static boolean isValidLength (String username) {
        return username.length() >= 3 && username.length() <= 16;
    }

    //метод, който проверява дали потребителското име е с валидно съдържание
    //true -> ако е с валидно съдържание
    //false -> ако е с невалидно съдържание
    public static boolean isValidContent (String username) {
        //username = "TestUser".toCharArray() -> ['T', 'e', 's', 't', 'U', 's', 'e', 'r']
        for (char symbol : username.toCharArray()) {
            if (symbol != '-' && symbol != '_' && !Character.isLetterOrDigit(symbol)) {
                //намираме символ в потребителското име, който не е валиден
                //невалиден символ -> невалиден username
                return false;
            }
        }

        //обходили всички символи и те са валидни -> валиден username
        return true;
    }
}
