
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1. HashMap - подредбата на записите не е от значение -> записите се подреждат на случаен принцип
        //2. LinkedHashMap - подредбата зависи от реда на добавяне
        //3. TreeMap - записите се сортират спрямо ключа
        //Ключът в MAP-вете винаги е уникален
        Map<String, Double> students = new TreeMap<>();



        //1. Добавяне на елемнти
        students.put("Ivan Ivanov", 5.50);//добавяме елемент в MAP-a -> ключ: Ivan, value: 5.50
        students.put("Stoyan", 3.80);
        students.put("Georgi", 4.20);

        //Map-овете имат размер -> колко елемента има в нашия мап
        System.out.println(students.size());

        students.put("Ivan Petrov", 5.80);


        //2. Премахване на елементи
        students.remove("Ivan Ivanov");
        students.remove("Yuli", 4.50);

        //3. Проверка дали имаме елементи в MAP-a
        System.out.println(students.isEmpty());// получаваме true or false -> в зависимост от това дали имаме записи в MAP-a


        //4. Проверка дали някой елемент съществува в MAP-a
        System.out.println(students.containsKey("Stoyan")); //получаваме true or false -> в зависимост от това дали имаме елемент с ключ "Stoyan" в MAP-a
        System.out.println(students.containsValue(3.00));//получаваме true or false -> в зависимост от това дали имаме елемент със стойност 3.00 в MAP-a

        //5. Премахваме всички елементи
        students.clear();
        System.out.println();

        //6. Вземането на дадена стойност
        double value = students.get("Ivan");

        //7. Добавяме запис само ако не съществува
        students.putIfAbsent("Nino", 3.80);

        //заменя стойността срещу даден ключ
        students.replace("Nino", 5.50);
        students.replace("Nino", 3.80, 6.00);//показваме колко е старат стойност


    }
}
