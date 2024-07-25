package FinalExamPrepPart1;

import java.util.Scanner;
public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder worldTour = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")){

            //вземаме командата, която имаме да изпълним
            String[] command = input.split(":");

            //switch-ваме по command -> 1. Add Stop, 2. Remove Stop, 3. Switch

            switch (command[0]){

                //добавяме дестинация към текущия стринг -> worldTour
                case "Add Stop" -> {

                    //Вземаме индексът и дестинацията, която трябва да добавим
                    int index = Integer.parseInt(command[1]);
                    String destinationToAdd = command[2];

                    //проверяваме дали индексът е валиден
                    if (index >= 0 && index < worldTour.length()){
                        //добавяме дестинацията, която сме прочели от конзолата
                        worldTour.insert(index, destinationToAdd);
                    }
                    //принтираме текущото състояние на -> worldTour
                    System.out.println(worldTour);

                }

                //премахваме дестинация от текущия текст
                case "Remove Stop" -> {
                    //Вземаме индексите, които ще ни показват стринга, който трябва да премахнем
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]) + 1;

                    //проверяваме дали двата индекса са валидни
                    if(startIndex >= 0 && endIndex <= worldTour.length()){
                        //Hawai::RomeCyprys-Greece -> Hawai::Rome-Greece

                        //заменяме стринга, който се формира от startIndex до endIndex с празен стринг
                        worldTour.replace(startIndex, endIndex, "");
                    }

                    System.out.println(worldTour);

                }

                //заменяме съществуваща дестинация с нова
                case "Switch" -> {

                    String oldDestination = command[1];
                    String newDestination = command[2];

                    //Hawai::Rome-Greece
                    int firstIndex = worldTour.indexOf(oldDestination);//индекс 0
                    int lastIndex = firstIndex + oldDestination.length();//индекс 5
                    //int lastIndex = worldTour.lastIndexOf(oldDestination);

                    //проверяваме дали дестинацията, която искаме да заменим съществува
                    if(worldTour.toString().contains(oldDestination)){
                        //заменяме съществуващата дестинация с новата
                        worldTour.replace(firstIndex, lastIndex, newDestination);
                    }

                    System.out.println(worldTour);

                }
            }


            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", worldTour);


    }
}
