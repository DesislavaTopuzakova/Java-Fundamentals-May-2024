package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //1. 23
        //2. 47
        //3. 14

        List<Integer> ages = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            int currentAge = Integer.parseInt(scanner.nextLine());

            ages.add(currentAge);
        }

        double[] arraySalaries = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        //"23.5 12.4 45.8" -> ["23.5", "12.4", "45.8"] -> {23.5, 12.4, 45.8}

       /* String [] doubles = scanner.nextLine().split(" ");

        List<Double> doubleList = new ArrayList<>();

        for (int i = 0; i < doubles.length; i++) {

            double currentDouble = Double.parseDouble(doubles[i]);
            doubleList.add(currentDouble);

        }*/

        List<Double> salaries = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());



        /*List<String> names = new ArrayList<>(Arrays.asList("Yuli", "Stoyan", "Lili"));

        List<Integer> numbers = new ArrayList<>();

        List<Double> doubleList = new ArrayList<>();

        numbers.add(0);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        numbers.set(1, 45);

        numbers.remove(0);
        numbers.remove(Integer.valueOf(3));



        names.add("Georgi");
        names.add("Ivan"); //{"Ivan"}
        names.add("Georgi");//{"Ivan", "Georgi"}



        names.add(0, "Krasi");



        names.remove("Georgi");//{"Ivan", "Petyr"} - премахва 1-вия срещнат елемент

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));

        for (String name : names){
            System.out.println(name);
        }

        for (int position = 0; position <= names.size() - 1; position++) {
            System.out.println(names.get(position));
        }
*/
        //Предимства ->
        //1. Преоразмеряваме -> няма нужда да знаем колко броя елементи имаме
        //2. По-функционален -> боравим по-лесно, по-лесно можем да го модифицираме

        /*
        --> List<String> names = new ArrayList<>(Arrays.asList("Yuli", "Stoyan", "Lili"));

1. Размер на лист/списък
    names.size() -> връща колко елемента има в списъка

2. Добавяме елементи
    List<Integer> numbers = new ArrayList<>();
    {10, 20, 40}
    numbers.add(2) -> добавя елемента 2 -> накрая на списъка -> {10, 20, 40, 2}
    numbers.add(2, 23) -> добавя елемента 23 на индекс 2 -> {10, 20, 23, 40, 2} -> останалите елементи се изместват надясно
    numbers.set(2, 100) -> заменя досегашния елемент 23 с нов елемент -> 100 -> {10, 20, 100, 40, 2}

3. Премахване на елементи
     При метода .remove() -> премахваме първия срещнат елемент
     numbers.remove(0); -> премахваме елемента на нулев индекс
     numbers.remove(Integer.valueOf(3)); -> премахваме елемента 3
     List<Double> doubleList = new ArrayList<>(23.5 , 15.8, 5.9);

     doubleList.remove(0) -> списъкът автоматично ще разбере какво подаваме в зависимост от стойността в скобите
        -> при doubleList.remove(0) -> премахваме елемента на индекс 0
        -> doubleList.remove(15.8) -> премахваме елемента 15.8

4. Отпечатване на списък

    4.1. for loop -> когато имаме за задача да работим с позициите
    4.2. Форийч -> когато имаме за задача да преминем през всички елементи от 0 до последния
    4.3. System.out.println(numbers.toString()); -> [10, 20, 100, 40, 2]
    4.4. System.out.println(String.join(", ", names)); -> names е списъкът, който искаме да се принтира

5. Други методи
    System.out.println(numbers.contains(100)); -> връща true or false, в зависимост от това дали елемента се съдържа в списъка
    System.out.println(numbers.isEmpty()); -> връща true or false, в зависимост от това дали списъкът е празен
    numbers.clear(); -> премахва всички елементи от списъка
    numbers.indexOf(20); -> на кой индекс се намира елемента 20

6. Сортиране

    6.1. Ascending order
    {10, 20, 100, 40, 2}
    Collections.sort(numbers); -> {2, 10, 20, 40, 100)

    6.2. Descending order
    {10, 20, 100, 40, 2}
    Collections.sort(numbers); -> {2, 10, 20, 40, 100)
    Collections.reverse(numbers); -> {100, 40, 20, 10, 2}

    За масиви използваме Arrays.sort(arrayNumbers);





         */





    }
}
