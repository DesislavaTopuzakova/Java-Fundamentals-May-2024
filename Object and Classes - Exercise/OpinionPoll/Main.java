package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //логиката на нашата задача: входни данни, изчисления, проверки, изходни данни
        Scanner scanner = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>(); //празен лист

        int countPeople = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countPeople; count++) {
            String personalData = scanner.nextLine();
            //"Peter 12".split(" ") -> ["Peter", "12"]
            String name = personalData.split(" ")[0]; //име -> "Peter"
            int age = Integer.parseInt(personalData.split(" ")[1]); //възраст -> 12

            //проверка за възраст
            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }

        //лист от обекти от клас Person
        //0 -> {name: "Sam", age: 31}
        //1 -> {name: "Itan", age: 48}

        for (Person person : peopleList) {
            //име - въраст
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
