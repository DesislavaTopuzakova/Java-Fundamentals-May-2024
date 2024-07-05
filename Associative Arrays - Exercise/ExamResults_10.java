package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username -> най-височия брой изкарани точки
        Map<String, Integer> userPoints = new LinkedHashMap<>();
        //language -> брой на събмитите
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String username = input.split("-")[0];
            if (input.contains("banned")) {
                //КОМАНДА ЗА БАНВАНЕ
                //input = "{username}-banned"
                userPoints.remove(username);
            } else {
                //input = "{username}-{language}-{points}"
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                //проверка дали този потребител е предавал нещо
                if (!userPoints.containsKey(username)) {
                    userPoints.put(username, points);
                } else {
                    int currentPoints = userPoints.get(username);
                    if (points > currentPoints) {
                        userPoints.put(username, points);
                    }
                }

                //проверка за програмния език
                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    int currentCount = languageCount.get(language);
                    languageCount.put(language, currentCount + 1);
                }
            }
            input = scanner.nextLine();
        }


        //1. отпечатваме потребителите и техните точки
        System.out.println("Results:");
        //userPoints: key(username) -> value (max points)
        userPoints.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));

        //2. отпечатваме програмните езици и техния брой решения
        System.out.println("Submissions:");
        //languageCount: key(language) -> value(бр. решения)
        languageCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
