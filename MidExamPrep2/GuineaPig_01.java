package MidExamPrep;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        double foodInKg = Double.parseDouble(scanner.nextLine()); //храна за 1 месец (килограми)
        double hayInKg = Double.parseDouble(scanner.nextLine()); //сено за 1 месец (килограми)
        double coverInKg = Double.parseDouble(scanner.nextLine()); //покривало за 1 месец (килограми)
        double pigWeightInKg = Double.parseDouble(scanner.nextLine()); //тегло на свинчето (килограми)

        //2. преобразуваме всичко в грамове
        double foodInGrams = foodInKg * 1000; //храна за 1 месец (грамове)
        double hayInGrams = hayInKg * 1000; //сено за 1 месец (грамове)
        double coverInGrams = coverInKg * 1000; //покривалото за 1 месец (грамове)
        double pigWeightInGrams = pigWeightInKg * 1000; //тегло на свинчето (грамове)

        for (int day = 1; day <= 30; day++) {  //обхождаме всеки ден от месеца
            //всеки ден яде по 300 гр.
            foodInGrams -= 300;

            //всеки втори ден -> смяна на сено
            if (day % 2 == 0) {
                //нужно сено = 5% от наличната храна
                double needHay = 0.05 * foodInGrams; //нужно сено при смяната
                hayInGrams -= needHay;
            }

            //всеки трети ден -> сменя покривалото
            if (day % 3 == 0) {
                //нужно покривало = 1/3 от теглото на свинчето
                double needCover = pigWeightInGrams / 3; //нужно количество покривало при смяната
                coverInGrams -= needCover;
            }


            //всеки ден проверяваме дали не е свършил някой консуматив
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return; //прекратява цялата програма
                //break; -> прекратява цикъла, в който се намира
            }
        }

        //вече сме обходили всички дни от месеца (30)
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                                            foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);


    }
}
