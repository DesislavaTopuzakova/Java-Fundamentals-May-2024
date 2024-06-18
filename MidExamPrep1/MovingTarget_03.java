package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //{"52 74 23 44 96 110" -> {52, 74, 23, 44, 96, 110}
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        //получаваме команда или end -> {"Shoot", "5", "10"} or {"end"}
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        //докато нямаме команда end ще манипулираме списъка с мишени
        while (!command.get(0).equals("End")){

            //вземаме командата от нулевия индекс на списъка command
            String currentCommand = command.get(0);//{"Shoot", "5", "10"} -> "Shoot"
            //вземаме индексът, който ще манипулираме
            int index = Integer.parseInt(command.get(1));//{"Shoot", "5", "10"} -> 5

            //switch-ваме по текущата команда
            // мишени -> {52, 74, 23, 44, 96, 110}
            switch (currentCommand){

                //{"Shoot", "5", "10"}

                case "Shoot" ->{
                    //{52, 74, 23, 44, 96, 100}
                    //{"Shoot", "5", "10"}
                    //проверяваме дали индексът съществува
                    if(index < targets.size() && index >=0){
                        int power = Integer.parseInt(command.get(2));//10
                        int currentTargetValue = targets.get(index); // 100 -> стойността на елемнта, който се намира на конкретния индекс
                        int newValue = currentTargetValue - power;
                        targets.set(index, newValue);

                        //ако новата стойност на мишената е <= 0 -> премахваме мишената
                        if(newValue <= 0){
                            targets.remove(index);
                        }
                    }
                }

                //{"Add", "2", "10"}
                case "Add" -> {

                    //проверяваме дали индексът съществува
                    if(index < targets.size() && index >=0){
                        //стойността, която искаме да добавим към елемента на конкретния индекс
                        //{52, 74, 23, 44, 96, 100}
                        //{"Add", "0", "10"}
                        int value = Integer.parseInt(command.get(2));//10
                        targets.add(index, value); //{10, 52, 74, 23, 44, 96, 100}

                    }else {
                        System.out.println("Invalid placement!");
                    }
                }

                case "Strike" -> {
                    //радиусът, в който трябва да премахнем елементи
                    int radius = Integer.parseInt(command.get(2));

                    //проверяваме дали радиусът ще засегне съществуващи индекси
                    if(index - radius >= 0 && index + radius < targets.size()){

                        //List<Integer> newSubList = targets.subList(index - radius, index + radius + 1);//{10, 52, 74, 23, 44,}
                        targets.subList(index - radius, index + radius + 1).clear();// {10, 52, 74, 23, 44, 96, 100} -> index 2, radius 2 ->{96, 100}

                    }else {
                        System.out.println("Strike missed!");
                    }

                }
            }





            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }


        System.out.println(targets.toString().replace("[", "").replace("]", "").replaceAll(", ", "|"));




    }
}
