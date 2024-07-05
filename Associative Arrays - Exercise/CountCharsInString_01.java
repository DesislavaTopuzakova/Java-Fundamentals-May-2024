package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(" ", "");

        //запис: символ -> бр. срещания
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        //input = "Desislava".toCharArray() -> ['D', 'e', 's', 'i', 's', 'l', 'a', 'v', 'a']
        char[] symbols = input.toCharArray();
        for (char symbol : symbols) {
            //проверка дали е интервал
            if (symbol == ' ') {
                continue; //пропусне всичко надолу и ще премине към следващия символ
            }
            //проверка дали съм срещала такъв символ
            if (!symbolsCount.containsKey(symbol)) {
                //не сме срещали такъв символ
                symbolsCount.put(symbol, 1);
            } else {
                //срещали сме такъв символ
                int currentCount = symbolsCount.get(symbol); //текущ брой на срещаия
                symbolsCount.replace(symbol, currentCount, currentCount + 1);
            }
        }

        //map: key (символ) -> value (бр. срещания)

        //начин 1
        for(Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            //entry -> всеки отделен запис
            //entry.getKey() -> символ
            //entry.getValue() -> бр. срещания
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //начин 2
        /*symbolsCount
                .entrySet()   //съвкупността от всички записи
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));*/

    }
}
