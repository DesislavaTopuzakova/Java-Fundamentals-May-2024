package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine() //"Iron, Wood, Sword"
                                                  .split(", ")) //["Iron", "Wood", "Sword"]
                                                  .collect(Collectors.toList()); //{"Iron", "Wood", "Sword"}

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {

            if (command.contains("Collect")) {
                //command = "Collect - {item}".split(" - ") -> ["Collect", "{item}"]
                String elementToAdd = command.split(" - ")[1];
                if (!elementsList.contains(elementToAdd)) {
                    elementsList.add(elementToAdd);
                }
            } else if (command.contains("Drop")) {
                //command = "Drop - {item}".split(" - ") -> ["Drop", "{item}"]
                String elementToRemove = command.split(" - ")[1];
                elementsList.remove(elementToRemove); //remove -> 1. проверява има ли го този елемент   2. премахва
            } else if (command.contains("Combine Items")) {
                //command = "Combine Items - {old_item}:{new_item}"
                //command = "Combine Items - Sword:Bow".split(" - ") -> ["Combine Items", "Sword:Bow"]
                //[1] -> "Sword:Bow".split(":") -> ["Sword", "Bow"]
                String oldElement = command.split(" - ")[1].split(":")[0];
                String newElement = command.split(" - ")[1].split(":")[1];

                if (elementsList.contains(oldElement)) {
                    int positionOldElement = elementsList.indexOf(oldElement);
                    elementsList.add(positionOldElement + 1, newElement);
                }

            } else if (command.contains("Renew")) {
                //command = "Renew – {item}".split(" - ") -> ["Renew", "{item}"]
                String elementToMove = command.split(" - ")[1];
                if (elementsList.contains(elementToMove)) {
                    elementsList.remove(elementToMove);
                    elementsList.add(elementToMove);
                }
            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", elementsList));
    }
}
