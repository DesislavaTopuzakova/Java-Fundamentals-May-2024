package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine(); // "Holy Ghost, content, John Sandford"
        //"Holy Ghost, content, John Sandford".split(", ") -> ["Holy Ghost", "content", "John Sandford"]
        String title = articleData.split(", ")[0]; //заглавие
        String content = articleData.split(", ")[1]; //съдържание
        String author = articleData.split(", ")[2]; //автор

        Article article = new Article(title, content, author);

        int countCommands = Integer.parseInt(scanner.nextLine()); //брой команди за изпълнение
        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            //1. "Edit: Test".split(": ")               -> ["Edit", "Test"]
            //2. "ChangeAuthor: Ivan Vazov".split(": ") -> ["ChangeAuthor", "Ivan Vazov"]
            //3. "Rename: Title 1".split(": ")          -> ["Rename", "Title 1"]
            String commandName = command.split(": ")[0]; // "Edit", "ChangeAuthor", "Rename"
            String parameter = command.split(": ")[1]; //параметър, с който работи командата

            switch (commandName) {
                case "Edit" -> article.edit(parameter);
                case "ChangeAuthor" -> article.changeAuthor(parameter);
                case "Rename" -> article.rename(parameter);
            }
        }

        System.out.println(article.toString());

    }
}
