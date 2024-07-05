package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //продукт -> брой
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        //продукт -> актуалната цена
        Map<String, Double> productsPrice = new LinkedHashMap<>();


        String productData = scanner.nextLine();

        while (!productData.equals("buy")) {
            //productData = "Beer 2.20 100".split(" ") -> ["Beer", "2.20", "100"]
            String productName = productData.split(" ")[0]; //име на продукта
            double price = Double.parseDouble(productData.split(" ")[1]); //ед. цена на продукта
            int quantity = Integer.parseInt(productData.split(" ")[2]); //количество на продукта

            //проверка дали съществува такъв продукт
            if (!productsQuantity.containsKey(productName)) {
                //нямаме такъв продукт
                productsQuantity.put(productName, quantity);
            } else {
                //имаме такъв продукт
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + quantity);
            }

            //актуализираме с последната цена
            productsPrice.put(productName, price);

            productData = scanner.nextLine();
        }

        //продукт -> закупено количество -> ед. цена
        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            //entry (key: име на продукта -> value: количество)
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
