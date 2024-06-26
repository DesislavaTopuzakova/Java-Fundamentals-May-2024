package ObjectAndClasses.Students;

public class Student {

    //first name, last name, age, and hometown.

    private  String firstName;
    private  String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        //първоначално се създава празен обект

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
