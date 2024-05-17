package BasicsRecap_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //потребителски профил -> username, password
        String username = scanner.nextLine(); //потребителско име
        String password = ""; //паролата за профила

        //1. намираме паролата
        //username: "Acer"
        //password: "recA"
        //всички позиции на символите в текста от последната към първата
        for (int position = username.length() - 1; position >= 0; position--) {
            //действията, които се изпълняват за всяка позиция
            char symbol = username.charAt(position); //символа на текущата позиция
            password += symbol; //password = password + symbol;
        }

        //2. обработваме достъпването на профила
        //while цикъл
        //повтаряме: въвеждаме парола
        //stop: въведената парола == password
        //continue: въведената парола != password

        String enteredPassword = scanner.nextLine();
        int countWrongAttempts = 0; //брой неуспешните опити
        while (!enteredPassword.equals(password)) {
            //въвели грешна парола
            countWrongAttempts++;
            //1. проверка дали сме блокирали профила
            if (countWrongAttempts == 4) {
                System.out.printf("User %s blocked!", username);
                return; //прекратява цялата програма
            }
            //2. ОПИТАЙ ОТНОВО
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        //вярна парола
        System.out.printf("User %s logged in.", username);
    }
}
