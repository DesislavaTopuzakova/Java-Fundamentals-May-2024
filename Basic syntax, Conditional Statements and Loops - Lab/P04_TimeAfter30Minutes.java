package ProgramingBasicsOverview;

import java.util.Scanner;

public class P04_TimeAfter30Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesPlus30Minutes = hour * 60 + minutes + 30;

        int finalHours = totalMinutesPlus30Minutes / 60;
        int finalMinutes = totalMinutesPlus30Minutes % 60;

        if(finalHours > 23){
            finalHours = 0;
        }

        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}
