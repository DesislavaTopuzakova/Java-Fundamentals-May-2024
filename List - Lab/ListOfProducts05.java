package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        //4
        //Potatoes
        //Tomatoes
        //Onions
        //Apples

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= numberOfProducts ; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);

        }

        //{"Potatoes", "Tomatoes", "Onions, "Apples"}


        Collections.sort(products); //{"Apples", "Onions", "Potatoes, "Tomatoes"} -> подрежда продуктите в нарастващ ред (ascending order)

        //int counter = 1;
        for (int index = 0; index < products.size(); index++) {

            System.out.printf("%d.%s%n", (index + 1), products.get(index)); // вместо (index + 1) -> можем да използваме counter

            //counter++;


        }


    }
}
