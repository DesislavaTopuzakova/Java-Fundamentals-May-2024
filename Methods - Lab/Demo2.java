package Methods;

public class Demo2 {

    public static void main(String[] args) {


       printNumbersFrom1To3();
       printNumbersFrom50To100();
       printNumbersFrom1To3();
       printNumbersFrom50To100();
       printNumbersFrom50To100();
       printNumbersFrom1To3();

    }

    public static void printNumbersFrom1To3 (){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

    }

    public static void printNumbersFrom50To100 (){
        for (int i = 50; i <=100 ; i++) {
            System.out.println(i);
        }

    }
}
