import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {

    public static String findDay(int day, int month, int year){
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(d, m, y);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        String result = findDay(day, month, year);
        System.out.println(result);
    }
}
