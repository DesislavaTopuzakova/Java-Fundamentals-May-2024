
import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());

            /*List<String> currentSynonyms = words.get(word);//вземаме списъка със синомими
            currentSynonyms.add(synonym);//добавяме новия синоним
            words.put(word, currentSynonyms);//презаписваме ключа и списъка със синоми за конкретната дума*/
            words.get(word).add(synonym);// вземаме списъка срещу ключа word -> добавяме новата дума

        }


        for (Map.Entry<String, List<String >> entry : words.entrySet()){

            String currentWord = entry.getKey();
            List<String> synonymsForCurrentWord = entry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }


    }
}
