package ObjectAndClasses.Students_02;

public class Student_02 {

    //first name, last name, age, and hometown.

    private  String firstName;
    private  String lastName;
    private int age;
    private String hometown;

    public Student_02(String firstName, String lastName, int age, String hometown) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
