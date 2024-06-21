package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с продукти
        List<String> productsList = Arrays.stream(scanner.nextLine()      //"Tomatoes!Potatoes!Bread"
                                    .split("!"))                    //["Tomatoes", "Potatoes", "Bread"]
                                    .collect(Collectors.toList());         //{"Tomatoes", "Potatoes", "Bread"}


        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {

            String [] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Urgent", "Unnecessary", "Correct", "Rearrange"
            String item = commandParts[1]; //името на артикула, с който ще работим в командата

            //проверка коя е въведената команда
            switch (commandName) {
                case "Urgent":
                    //добавя артикула в началото на списъка, ако го няма
                    //1. command = "Urgent {item}".split(" ")-> ["Urgent", "{item}"]
                    if (!productsList.contains(item)) {
                        productsList.add(0, item); //вмъкваме на определено място в списъка
                    }
                    break;
                case "Unnecessary":
                    //премахваме артикула от списъка, ако го има
                    //2. command = "Unnecessary {item}".split(" ")-> ["Unnecessary", "{item}"]
                    productsList.remove(item); //премахва само ако елементът е в списъка
                    break;
                case "Correct":
                    //item = артикул, който ще заменяме
                    //3. command = "Correct {oldItem} {newItem}".split(" ") -> ["Correct", "{item}", "{newItem}"]
                    String newItem = commandParts[2]; //артикул, който ще заменя item
                    //заменяме артикула с новия в списъка, ако го има
                    if (productsList.contains(item)) {
                        int position = productsList.indexOf(item);
                        productsList.set(position, newItem); //замяна
                    }
                    break;
                case "Rearrange":
                    //4. command = "Rearrange {item}".split(" ")            -> ["Rearrange", "{item}"]
                    //премахваме артикула от списъка и го добавяме в края, ако го има
                    if (productsList.contains(item)) {
                        productsList.remove(item);
                        productsList.add(item);
                    }
                    break;

            }
            command = scanner.nextLine();
        }

        //отпечатваме артикули в списъка разделени със запетая и интервал
        //начин 1: String.join -> работи само за списък от текстове
        System.out.println(String.join(", ", productsList));

        //начин 2: productsList = {"Tomatoes, Potatoes, Lettuce"}
        /*System.out.println(productsList.toString() //["Tomatoes, Potatoes, Lettuce"]
                .replace("[", "")  //"Tomatoes, Potatoes, Lettuce"]
                .replace("]", "")); //"Tomatoes, Potatoes, Lettuce"*/

        //начин 3: productsList = {"Tomatoes, Potatoes, Lettuce"}
        /*for (int position = 0; position <= productsList.size() - 1; position++) {
            String currentItem = productsList.get(position); //текущия артикул
            //само след последния елемент да не слагаме ", "
            if (position == productsList.size() - 1) {
                //последната позиция = последния елемент
                System.out.print(currentItem);
            } else {
                System.out.print(currentItem + ", ");
            }
        }*/

    }
}
