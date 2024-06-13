package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //{10 -5 7 9 -33 50}
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {

            int currentNumber = numbers.get(i);
            if (currentNumber < 0){
                numbers.remove(Integer.valueOf(currentNumber));
                i--;
            }

        }



        //numbers.removeIf(n -> n < 0);

        Collections.reverse(numbers);//{50, 9, 7, 10}

        if(numbers.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.println(numbers.toString().replace("[", "").replace("]", "").replaceAll(",", ""));

        }


    }
}
