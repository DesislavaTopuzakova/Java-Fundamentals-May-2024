package MidExamPrep1;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //прочитаме входа, като сплитваме по | -> масив от стаите
        //"rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000"
        //["rat 10", "bat 20", "potion 10", "rat 10", "chest 100", "boss 70", "chest 1000"]
        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;

        //int roomCounter = 0;

        //правим един фор цикъл, за да преминем през всяка от стаите
        for (int i = 0; i < rooms.length; i++) {
            //roomCounter++;
            //създаваме един масив -> това ще представлява нашата текуща стая -> 2 елемента 1. command/monster 2. points -> health, bitcoins, attack
            String [] currentRoom = rooms[i].split(" ");//["rat, "10"]

            String commandOrMonster = currentRoom[0];//command/monster
            //точките могат да бъдат health, bitcoins, attack
            int points = Integer.parseInt(currentRoom[1]);

            //switch-ваме по елемента на нулева позиция в стаята -> //command/monster
            //potion или chest -> default -> някакво чудовище
            switch (commandOrMonster){

                case "potion" ->{
                    //Ако сбора на точките + текущата стойност за health е повече от 100 -> добавяме само необходимите точки, за да стане 100
                    if(points + health > 100){
                        //точките, които трябва да добавим = 100 - health(текущите единици(точки) здраве)
                        points = 100 - health;
                    }
                    //прибавяме точките от конкретната стая към текущите точки на здравето
                    health += points;

                    //Принтираме колко точки здраве сме добавили и колко общата сума на здравето
                    System.out.printf("You healed for %d hp.%n", points);
                    System.out.printf("Current health: %d hp.%n", health);
                }

                case "chest" -> {
                    //увеличаваме броя на биткоини -> точките представляват биткоини, които ще съберем
                    bitcoins += points;
                    System.out.printf("You found %d bitcoins.%n", points);
                }

                default -> {
                    //премахваме от health точките, с които ни атакува чудовището
                    health -= points;

                    //ако стойността на здравето ни е по-голяма от 0 -> победили сме чудовището
                    if(health > 0){
                        System.out.printf("You slayed %s.%n", commandOrMonster);
                    }else {
                        //ако сме в този else това означава, че имам 0 или по-малко здраве -> играта приключва
                        System.out.printf("You died! Killed by %s.%n", commandOrMonster);
                        System.out.printf("Best room: %d", i + 1);//можем да си създадем roomCounter
                    }

                }

            }

            //след като преминем през стаята проверяваме дали имаме health -> ако е <= 0 прекратяваме обхождането на стаите
            if(health <= 0){
                break;
            }

        }

        //ако имаме здраве > 0 -> сме преминали през всички стаи успешно
        if(health > 0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }

    }
}
