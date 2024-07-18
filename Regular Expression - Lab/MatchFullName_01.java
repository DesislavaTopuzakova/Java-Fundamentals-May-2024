package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> names = new ArrayList<>();

        while (matcher.find()){

            System.out.print(matcher.group() + " ");
        }





    }
}
