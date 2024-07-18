package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String [] demonNames = scanner.nextLine() //"Leopold   ,    Merrie , Goldham,     Stephen   ,     Rodgers,Bob"
                                .replace(" ", "") //"Leopold,Merrie,Goldham,Stephen,Rodgers,Bob"
                                .split(","); //["Leopold", "Merrie", "Goldham", "Stephen", "Rodgers" , "Bob"]

        for (String demonName : demonNames) {
            int health = getHealth(demonName);
            double damage = getDamage(demonName);

            //модификация на damage спрямо името на демона
            for (char symbol : demonName.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }

            //отпечатваме за всеки един демон
            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }

    //изчислим и връща стойността на damage
    private static double getDamage(String demonName) {
        double damage = 0;
        //всички дробни и цели числа, които са положителни и отрицателни
        String regexNumber = "[-]?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(demonName);
        //matcher = ["3", "1", "0"]
        //demonName = "M3ph1st0**"

        while(matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        return damage;
    }

    //изчислим и връща стойността на health
    private static int getHealth(String demonName) {
        //health = сума от ascii кодовете на всички символи без: [0-9], +, -, *, /
        int health = 0;
        for (char symbol : demonName.toCharArray()) {
            if (symbol != '+' && symbol != '-'
                    && symbol != '*' && symbol != '/' && symbol != '.'
                    && !Character.isDigit(symbol)){
                health += symbol;
            }
        }
        return health;
    }
}
