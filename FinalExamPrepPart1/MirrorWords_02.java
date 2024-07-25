package FinalExamPrepPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<delimiter>[#|@])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        //създаваме списък, в който ще пазим огледалните думи
        List<String> mirrorWords = new ArrayList<>();

        int countValidPairs = 0;
        while (matcher.find()){
            countValidPairs++;

            //Вземаме първата думичка
            //#poOl##loOp# -> poOl
            StringBuilder firstWord = new StringBuilder(matcher.group("firstWord"));
            String secondWord = matcher.group("secondWord");
            String reversedWord = firstWord.reverse().toString();//lOop

            //проверяваме дали двете думи са огледални
            if(reversedWord.equals(secondWord)){
                //#Part##traP
                //firstWord = trap
                firstWord.reverse();//Part
                firstWord.append(" <=> ").append(secondWord); // Part <=> traP
                mirrorWords.add(firstWord.toString());

            }


        }

        //проверяваме дали имаме валидни двойки
        if(countValidPairs == 0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }else {
            System.out.printf("%d word pairs found!%n", countValidPairs);
            //проверяваме дали имаме огледални думи
            if(mirrorWords.isEmpty()){
                System.out.println("No mirror words!");
            }else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", mirrorWords));
            }
        }



    }
}
