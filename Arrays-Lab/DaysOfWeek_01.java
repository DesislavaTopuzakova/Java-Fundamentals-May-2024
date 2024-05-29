package Arrays;

import java.util.Scanner;

public class DaysOfWeek_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int currentDay = Integer.parseInt(scanner.nextLine());

        if(currentDay >= 1 && currentDay <= 7){
            System.out.println(days[currentDay - 1]); // 3 -> Wednesday
        }else {
            System.out.println("Invalid day!");
        }
    }
}
