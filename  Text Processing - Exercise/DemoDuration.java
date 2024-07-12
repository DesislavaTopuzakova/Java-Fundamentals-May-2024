import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DemoDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Duration duration = Duration.from(ChronoUnit.HOURS.getDuration());
        System.out.println(duration.toHours());
    }
}
