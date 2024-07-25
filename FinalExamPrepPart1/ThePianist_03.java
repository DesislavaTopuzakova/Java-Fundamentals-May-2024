package FinalExamPrepPart1;

import java.util.*;

public class ThePianist_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

        //създаваме си МАП, в който ще си запазваме пиесите/произведения
        Map<String, List<String>> collection = new LinkedHashMap<>();

        for (int i = 1; i <= countPieces ; i++) {
            //прочитаме текущо произведение
            String[] currentInput = scanner.nextLine().split("\\|");

            //вземаме всички елементи от масива
            String currentPiece = currentInput[0];
            String currentComposer = currentInput[1];
            String currentKey = currentInput[2];

            //създаваме текущия списък
            List<String> currentList = new ArrayList<>();

            //добавяме към списъка композитора и ключа
            currentList.add(currentComposer);
            currentList.add(currentKey);

            //добавяме в МАП
            //Fur Elise|Beethoven|A Minor
            collection.put(currentPiece, currentList);

        }

        //прочитаме команда
        String input = scanner.nextLine();

        while (!input.equals("Stop")){

            //Add|Sonata No.2|Chopin|B Minor
            String currentCommand = input.split("\\|")[0];//"Add"
            String currentPiece = input.split("\\|")[1];//"Sonata No.2"


            //Add, Remove, ChangeKey
            switch (currentCommand){

                case "Add" -> {

                    if(!collection.containsKey(currentPiece)){
                        //създаваме си празен списък
                        List<String> listToAdd = new ArrayList<>();

                        //Вземаме името на композитора
                        String currentComposerToAdd = input.split("\\|")[2];//Chopin

                        //Вземаме ключа към композитора
                        String currentKeyToAdd = input.split("\\|")[3];//B Minor

                        //добавяме към списъка композитора и ключа
                        listToAdd.add(currentComposerToAdd);
                        listToAdd.add(currentKeyToAdd);

                        //добавяме в МАП
                        collection.put(currentPiece, listToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposerToAdd, currentKeyToAdd);
                    }else {
                        System.out.println(currentPiece + " is already in the collection!");
                    }


                }

                case "Remove" -> {

                    if(!collection.containsKey(currentPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }else {
                        collection.remove(currentPiece);
                        System.out.printf("Successfully removed %s!%n", currentPiece);
                    }


                }

                case "ChangeKey" -> {

                    if(!collection.containsKey(currentPiece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }else {
                        String newKey = input.split("\\|")[2];

                        collection.get(currentPiece).set(1, newKey);
                        /*collection.get(currentPiece).remove(1);
                        collection.get(currentPiece).add(newKey);*/

                        System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);


                    }

                }


            }

            input = scanner.nextLine();
        }

        collection.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}
