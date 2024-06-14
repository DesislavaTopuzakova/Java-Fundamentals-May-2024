package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                 .map(Integer::parseInt).collect(Collectors.toList());

        //{1, 23, 29, 18, 43, 21, 20}

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Add", "Insert", "Remove", "Shift"

            switch (commandName) {
                case "Add" -> {
                    //command = "Add 56".split(" ")-> commandParts = ["Add", "56"]
                    //add number at the end
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                }
                case "Insert" -> {
                    //command = "Insert 34 0".split(" ") -> commandParts = ["Insert", "34", "0"]
                    //insert number at given index
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int position = Integer.parseInt(commandParts[2]);
                    //проверка дали е валидна позицията
                    if (position >= 0 && position <= numbers.size() - 1) {
                        //валидна позиция в списъка
                        numbers.add(position, numberToInsert);
                    } else {
                        //невалидна позиция
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    //command = "Remove 2".split(" ") -> commandParts = ["Remove", "2"]
                    //remove that index
                    int positionToRemove = Integer.parseInt(commandParts[1]);
                    //проверка дали съществува такава позиция
                    if (positionToRemove >= 0 && positionToRemove <= numbers.size() - 1) {
                        //валидна позиция
                        numbers.remove(positionToRemove);
                    } else {
                        //невалидна позиция
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" -> {
                    //4. command = "Shift left 3".split(" ")  -> commandParts = ["Shift", "left", "3"]
                    //5. command = "Shift right 2".split(" ") -> commandParts = ["Shift", "right", "2"]
                    String direction = commandParts[1]; // "left" или "right"
                    int count = Integer.parseInt(commandParts[2]);
                    if (direction.equals("left")) {
                        //first number becomes last 'count' times
                        for (int i = 1; i <= count; i++) {
                            //повтаряме: първото число става последно
                            //1. взимаме първото число
                            int firstNumber = numbers.get(0);
                            //2. премахвам първото число
                            numbers.remove(0);
                            //3. добавям го като последно
                            numbers.add(firstNumber);
                        }
                    } else if (direction.equals("right")) {
                        //last number becomes first 'count' times
                        for (int i = 1; i <= count; i++) {
                            //повтаряме: последното число става първо
                            //1. взимаме последното число
                            int lastNumber = numbers.get(numbers.size() - 1);
                            //2. премахваме последното число
                            numbers.remove(numbers.size() - 1);
                            //3. добавяме го в началото
                            numbers.add(0, lastNumber);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
