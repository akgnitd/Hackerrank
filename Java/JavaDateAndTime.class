import java.time.LocalDate;

/* Sample Input
08 05 2015

Sample Output
WEDNESDAY */

public class JavaDateAndTime {

    public static void main(String[] args) {
        findDay(4, 12, 1996);
    }

    public static String findDay(int month, int day, int year) {

        String value = LocalDate.of(year, month, day).getDayOfWeek().name();
        System.out.println(value);
        return value;
    }

}
