package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                         .map(Integer::parseInt).collect(Collectors.toList());

        //{1, 2, 2, 4, 2, 2, 2, 9}
        String input = scanner.nextLine(); //"{bombNumber} {power}"
        //input = "4 2".split(" ") -> ["4", "2"]
        int bombNumber = Integer.parseInt(input.split(" ")[0]); //4
        int power = Integer.parseInt(input.split(" ")[1]); //2

        //повтаряме: гърмим намерена бомба
        //стоп: нямаме повече бомби в списъка
        //продължаваме: имаме бомби в списъка

        while (numbers.contains(bombNumber)) {
            //1. намираме бомбата на коя позиция е
            int bombPosition = numbers.indexOf(bombNumber); //3
            //{1, 2, 2, 4, 2, 2, 2, 9}
            int startPosition = Math.max(0, bombPosition - power); //начална позиция за премахване
            int endPosition = Math.min(numbers.size() - 1, bombPosition + power); //крайна позиция за премахване

            //2.премахваме всички бомбандирани числа
            for (int position = endPosition; position >=  startPosition; position--) {
                numbers.remove(position);
            }
        }

        //списък след гърмежите: {1, 2, 9}
        //нямаме повече бомби в списъка -> гръмнали сме всички
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);


    }
}
