package TextProcessing;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        StringBuilder sb = new StringBuilder();//празен StringBuilder
        sb.append("Hello, ");// добавяме текста "Hello, "
        sb.append("Yuli!");// добавяме текста "Yuli!"

        System.out.println(sb);//Hello, Yuli!
        System.out.println(sb.length());// принтираме дължината на текста

        sb.delete(6, sb.length());//изтриваме всички елементи от 6 индекс до края -> вторият индекс не е включително

        System.out.println(sb.reverse());//обръщаме текст

        sb.insert(0, "Yuli, ");//вмъкваме елементи

        System.out.println(sb);*/

        StringBuilder newSB = new StringBuilder();

        String example = "";
        System.out.println(LocalTime.now());

        for (int i = 1; i <=1000000 ; i++) {

           newSB.append("s");

        }

        System.out.println(newSB);
        System.out.println(LocalTime.now());











    }
}
