package ExamPreparation;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. прочитане на входни данни, обработка и съхранение
        //растение -> индекс на рядкост (rarity)
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();

        //растение -> списък с рейтинги
        Map<String, List<Double>> plantsRatings = new LinkedHashMap<>();

        int countPlants = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countPlants; count++) {
            String input = scanner.nextLine();
            //input = "{plant}<->{rarity}".split("<->") -> ["{plant}", "{rarity}"]
            String plantName = input.split("<->")[0]; //име на растението
            int rarity = Integer.parseInt(input.split("<->")[1]); //индекс на рядкост

            //запазвам си растението и неговия индекс на рядкост
            plantsRarity.put(plantName, rarity);

            //запазвам растението и списък с рейтинги
            //putIfAbsent -> добавя запис, ако нямаме такъв ключ
            plantsRatings.putIfAbsent(plantName, new ArrayList<>());
        }

        //растение -> индекс на рядкост
        //растение -> празен списък с рейтинги

        // 2. изпълняване на команди
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            //валидна команда -> изпълнявам командата
            String []commandParts = command.split(": ");
            String commandName = commandParts[0]; //"Rate", "Update", "Reset"
            String plant = commandParts[1].split(" - ")[0];

            //преди да изпълним командата -> проверка има ли такова растение, с което ще работим
            if (!plantsRarity.containsKey(plant)) {
                //нямаме запазено такова растение -> не можем да извършваме команда върху него -> невалидна команда
                System.out.println("error");
            } else {
                //валидна команда -> изпълняваме
                if (commandName.equals("Rate")) {
                    //command = "Rate: {plant} - {rating}".split
                    //commandParts = ["Rate", "{plant} - {rating}"]
                    double rating = Double.parseDouble(commandParts[1].split(" - ")[1]);
                    //"{plant} - {rating}".split(" - ") -> ["{plant}", "{rating}"]
                    plantsRatings.get(plant).add(rating);
                } else if (commandName.equals("Update")) {
                    //command = "Update: {plant} - {new_rarity}".split
                    //commandParts = ["Update", "{plant} - {new_rarity}"]
                    //промяна на индекса на рядкост на растението
                    int newRarity = Integer.parseInt(commandParts[1].split(" - ")[1]);
                    //"{plant} - {new_rarity}".split(" - ") -> ["{plant}", "{new_rarity}"]
                    plantsRarity.put(plant, newRarity);
                } else if (commandName.equals("Reset")) {
                    //command = "Reset: {plant}".split
                    //commandParts = ["Reset", "{plant}"]
                    plantsRatings.get(plant).clear();
                }
            }

            command = scanner.nextLine();
        }

        //3. отпечатване
        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().forEach(entry -> {
            //entry
            //key -> име на растение
            //value -> индекс на рядкост
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            // plantsRatings.get(plantName) -> списък с всички рейтинги за растението {3.5, 2.4, 5.6}
            double averageRating = plantsRatings.get(plantName).stream().mapToDouble(a -> a).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        });
    }
}
