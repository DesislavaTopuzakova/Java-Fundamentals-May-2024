package Demo;

public class Child {
    private String name;
    private int age;

    //конструктор
    public Child (String name, int age) {
        //нов празен обект
        this.name = name;
        this.age = age;
    }

    //getter -> контролиран достъп до стойността в полето
    public String getName() {
       return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //setter -> контролирано задаване на стойност на полето
    public void setName(String name) {
        if (name.length() >= 10 && name.length() <= 20) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (age >= 10 && age <= 18){
            this.age = age;
        }
    }

}
