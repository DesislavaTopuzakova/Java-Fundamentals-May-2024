package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Yuliyan";




        name = name.replace("Yu", "I");

        name = name + " Kastamanov";

        List<String> names = new ArrayList<>();

        names.add("Yuliyan");

        //Immutable - int, double, String
        //mutable List, Map, array

        //1. Дължина на текста = брой символи в текста
        System.out.println(name.length());// -> int

        //2. Достъпваме елементите -> 0 -> name.length() - 1

        System.out.println(name.charAt(0)); // -> първи елемент
        System.out.println(name.charAt(name.length() - 1));// -> последен елемент

        char [] symbols = name.toCharArray();//['Y', 'u', 'l', 'i', 'y', 'a', 'n']


        //3. Обхождане на текст
        // обхождаме от нулеш до последен индекс
        for (int i = 0; i < name.length(); i++) {
            char currentSymbol = name.charAt(i);
        }

        //обхождаме от последен до нулев индекс
        for (int i = name.length() - 1; i >= 0; i--) {
            char currentSymbol = name.charAt(i);
        }

        //4. Сравнение на текст -> name.equals("Yuli")
        //4.1 -> проверка дали дължините са равни
        //4.2 -> проверка символ по символ

        System.out.println(name.equalsIgnoreCase("YULIYAN"));

        //5. Concatenation ->
        // използваме оператора +
        String result = name + " Kastamanov";

        //чрез метода concat()
        String concatResult = name.concat("!").concat(" Kastamanov");

        //6. Join
        String text = String.join("-", "Yu", "li", "yan");

        //7. Split

        String name2 = "Ivan Ivanov Ivanov";

        String[] newNames = name2.split(" ");

        //8. repeat() -> повтаряме текста толкова пъти колкото му подадем
        System.out.print(name2.repeat(2));//"Ivan Ivanov IvanovIvan Ivanov Ivanov"

        //9. substring() ->
        //връща String, който започва от позиция 3 и завършва на позиция 6, но позиция 6 не се включва
        String substring1 = name.substring(3, 6);//"Yuliyan" -> "iya"



        //връща текс, който започва от индекс 4 и завършва с последния индекс
        String substring2 = name.substring(4);// "Yuliyan" -> "yan"

        //10. Търсене в String

        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));// връща 0 -> защото на нулевия индекс среща "banana" за 1-ви път
        System.out.println(fruits.indexOf("orange"));// връща -1 -> защото текста "orange" не се съдържа fruits;

        System.out.println(fruits.lastIndexOf("banana")); // 21 -> защото на 21-вия индекс срещаме "banana" за последен път
        System.out.println(fruits.lastIndexOf("orange")); // -1 -> защото текста "orange" не се съдържа fruits;

        //11. contains
        System.out.println(fruits.contains("banana"));// true -> ако текста "banana" се съдържа в fruits
                                                    // false -> ако текста "banana" не се съдържа в fruits

        //12. замяна
        fruits = fruits.replace("banana", "orange");

        //13. Други

        System.out.println(fruits.toLowerCase());//-> преобразува всичко в малки букви
        System.out.println(fruits.toUpperCase());//-> преобразува всичко в главни букви

        //"banana, apple, kiwi, banana, apple";
        System.out.println(fruits.startsWith("ba"));// true
        System.out.println(fruits.startsWith("apple"));// false

        System.out.println(fruits.endsWith("le")); //true
        System.out.println(fruits.endsWith("ba")); //false

        System.out.println(fruits.trim());//премахва white space -> в началото и в края на стринг-а



    }
}
