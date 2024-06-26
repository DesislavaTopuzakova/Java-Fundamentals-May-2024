package ObjectAndClasses;

public class Car {

    //Характеристики
    private String brand;
    private int hp;
    private String color;

    //Конструктор
    public Car (String brand, int hp, String color){

        //първоначално се създава един празен обект

        this.brand = brand;
        this.hp = hp;
        this.color = color;

    }

    //getters and setters -> методи, които осигуряват достъп до нашите полета
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void startEngine(){

        System.out.println("Engine Started!");
    }


}
