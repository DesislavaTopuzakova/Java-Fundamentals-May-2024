package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //да намерим валидните имейли в дадения текст
        //{user}@{host}
        //desislava.topuzakova@softuni.bg
        //user = desislava.topuzakova
        //host = softuni.bg

        String regexUser = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regexHost = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]+)+";
        String regexEmail = regexUser + "@" + regexHost; //текста на шаблона

        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(text);
        //matcher -> съвкупност от всички текстове, които ми отговарят на шаблона
        //text = "Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information."
        //matcher = ["s.miller@mit.edu", "j.hopking@york.ac.uk"]

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


        //if(matcher.find()) -> търсите един текст, който да отговаря на шаблона
        //while(matcher.find()) -> търсите няколко текста, които да отговарят на шаблона
    }
}
