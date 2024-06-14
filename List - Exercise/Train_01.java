package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                                        .map(Integer::parseInt).collect(Collectors.toList());
        //{0, 0, 0, 10, 2, 4, 10}

        int maxCapacity = Integer.parseInt(scanner.nextLine()); //макс брой хора във всеки вагон

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                //1. command = "Add 10".split(" ") -> ["Add", "10"]
                //добавяме нов вагон в списъка
                int count = Integer.parseInt(command.split(" ")[1]); //бр. хората в новия вагон
                wagons.add(count);
            } else {
                //2. command = "34"
                int passengers = Integer.parseInt(command); //бр. хората, които да добавя в някой вагон
                //{0, 0, 0, 10, 2, 4, 10}
                //макс = 75
                for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
                    int currentCountPassengers = wagons.get(wagon); //бр. хората в текущия вагон
                    //проверка: мога ли да качвам хора във вагона
                    if (currentCountPassengers + passengers <= maxCapacity) {
                        //качвам ги в текущия вагон
                        wagons.set(wagon, currentCountPassengers + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
