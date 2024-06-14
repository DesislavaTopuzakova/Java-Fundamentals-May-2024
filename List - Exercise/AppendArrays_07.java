package Lists_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //"7 | 4  5|1 0| 2 5 |3".split("|") -> ["7 ", " 4 5", "1 0", " 2 5 ", "3"]

        List<String> texts = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        //texts = {"7 ", " 4 5", "1 0", " 2 5 ", "3"}
        Collections.reverse(texts);
        //резултат: texts = {"3", " 2 5 ", "1 0", " 4 5", "7 "}

        System.out.println(texts.toString() //"[3,  2 5 , 1 0,  4  5, 7 ]"
                        .replace("[", "") //"3,  2 5 , 1 0,  4  5, 7 ]"
                        .replace("]", "") //"3,  2 5 , 1 0,  4  5, 7 "
                        .replaceAll(",", "") //"3  2 5  1 0  4  5 7 "
                        .replaceAll("\\s+", " ") //"3 2 5 1 0 4 5 7 "
                        .trim()); //"3 2 5 1 0 4 5 7"

    }
}
