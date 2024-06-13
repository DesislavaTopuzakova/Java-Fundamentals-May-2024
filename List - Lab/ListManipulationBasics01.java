package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4 19 2 53 6 43 -> "4 19 2 53 6 43" -> ["4", "19", "2", "53", "6", "43"] -> {4, 19, 2, 53, 6, 43}
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());// {4, 19, 2, 53, 6, 43}

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        //•	Add {number} – add a number to the end of the list
        //•	Remove {number} – remove a number from the list
        //•	RemoveAt {index} – remove a number at a given index
        //•	Insert {number} {index} – insert a number at a given index

        //докато не получим команда "end"
        //command.get(0) -> вземаме елемнта на индекс 0 -> Add, Remove, RemoveAt, Insert
        while (!command.get(0).equals("end")){

            //1. command = {"Add", "3"}
            //2. command = {"Remove", "2"}
            //3. command = {"RemoveAt", "1"} -> премахваме елемнта на индекс 1
            //4. command = {"Insert", "8", "3"} -> добавяме числото 8 на индекс 3

            String firstElement = command.get(0);// връща елемента на индекс 0 -> "Add"
            int secondElement = Integer.parseInt(command.get(1));// връща елемента на индекс 1 -> числото 3

            switch (firstElement){
                case "Add" -> numbers.add(secondElement); // добавяме числото 3 към листа -> {4, 19, 2, 53, 6, 43, 3}
                case "Remove" -> numbers.remove(Integer.valueOf(secondElement));// премахваме числото 2 от листа -> {4, 19, 53, 6, 43, 3}
                case "RemoveAt" -> numbers.remove(secondElement); //secondElement -> премахваме елементът, който се намира на конкретен индекс -> {4, 53, 6, 43, 3}
                case "Insert" -> {
                    int index = Integer.parseInt(command.get(2));
                    numbers.add(index, secondElement); // добавяме числото 8 на индекс 3 -> {4, 53, 6, 8, 43, 3}

                }
            }



            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
