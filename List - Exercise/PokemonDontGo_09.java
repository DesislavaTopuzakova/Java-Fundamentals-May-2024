package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                         .map(Integer::parseInt).collect(Collectors.toList());
         int sumRemovedElements = 0; //сума на всички премахнати числа
         //повтаряме: въвеждаме позиции от листа
        //стоп: празен лист = нямаме елементи в списъка -> бр. елементи <= 0
        //продължаваме: имаме елементи в списъка -> бр. елементи > 0

        while (numbers.size() > 0) {
            int position = Integer.parseInt(scanner.nextLine());
            //1. position < 0
            if (position < 0) {
                //{5, 10, 6, 3}
                //1. взимаме премахнатия елемент
                int removedElement = numbers.get(0);
                //2. добавяме го към сумата
                sumRemovedElements += removedElement;
                //3. премахваме първия елемент в списъка
                numbers.remove(0);
                //4. взимаме последния елемент в списъка
                int lastNumber = numbers.get(numbers.size() - 1);
                //5. поставяме последния елемент на първо място
                numbers.add(0, lastNumber);
                //6. модифицираме елементите на списъка спрямо премахнатия елемент
                modifyList(numbers, removedElement);
            }
            //2. position > последната
            else if (position > numbers.size() - 1) {
                //1. взимаме премахнатия елемент
                int removedElement = numbers.get(numbers.size() - 1);
                //2, сумираме премахнатия елемент
                sumRemovedElements += removedElement;
                //3. премахвам последния елемент
                numbers.remove(numbers.size() - 1);
                //4. взимам първия елемент
                int firstNumber = numbers.get(0);
                //5. поставям първия елемент на последно място
                numbers.add(firstNumber);
                //6. модифицираме елементите на списъка спрямо премахнатия елемент
                modifyList(numbers, removedElement);
            }
            //3. position да е валидна (между първата и последната)
            else { //position >= 0 && position <= numbers.size() - 1

                //1. взимаме премахнатия елемент
                int removedElement = numbers.get(position);
                //2. сумираме премахнатия елемент
                sumRemovedElements += removedElement;
                //3. премахваме елемента на дадената позиция
                numbers.remove(position);
                //4. модифицираме елементите на списъка спрямо премахнатия елемент
                modifyList(numbers, removedElement);
            }
        }
        System.out.println(sumRemovedElements);
    }

    //метод, който модифицира списъка спрямо премахнатия елемент
    private static void modifyList(List<Integer> numbers, int removedElement) {
        //numbers = {14, 2, 24, 16, 18}
        //removedNumber = 10
        for (int position = 0; position <= numbers.size() - 1; position++) {
            int currentNumber = numbers.get(position);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else { //current > removedElement
                currentNumber -= removedElement;
            }
            numbers.set(position, currentNumber);
        }
    }
}
