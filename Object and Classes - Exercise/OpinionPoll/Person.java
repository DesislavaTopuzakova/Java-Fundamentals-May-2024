package OpinionPoll;

public class Person {
    //полета -> характеристики
    //public = може да се достъпва навсякъде
    //private = може да се достъпва само в клас
    private String name;
    private int age;

    //default конструктор (вграден) -> създава празен обект от класа
    public Person() {
        //създава се ръчно само ако имаме друг конструктор
    }

    //конструктор -> създаваме нови обекти от класа
    public Person(String name, int age) {
        //нов празен обект
        this.name = name;
        this.age = age;
    }

    //методи -> действия

    //getter -> метод, който ми дава стойността на дадено поле

    //getter за полето name
    public String getName() {
      return this.name;
    }

    //getter за полето age
    public int getAge() {
        return this.age;
    }
}
