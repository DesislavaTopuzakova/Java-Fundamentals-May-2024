package Students;

public class Student {
    //полета -> характеристики
    private String firstName;
    private String lastName;
    private double grade;

    //конструктор -> създаваме обекти
    public Student (String firstName, String lastName, double grade) {
        //нов празен обект
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //методи -> действия

    //getters -> осигуряват достъп до стойността в полето

    //getter за полето firstName
    public String getFirstName() {
        return this.firstName;
    }

    //getter за полето lastName
    public String getLastName() {
        return this.lastName;
    }

    //getter за полето grade
    public double getGrade() {
        return this.grade;
    }

    //toString -> вграден метод; преобразува обекта в текст -> "{package}.{class}@{address}"
    @Override
    public String toString() {
        //представя обекта по формата на текст по мой избор
        //"{first name} {last name}: {grade}"
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);

    }

}
