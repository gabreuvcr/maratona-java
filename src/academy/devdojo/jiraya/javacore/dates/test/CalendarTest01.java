package academy.devdojo.jiraya.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        } else if (calendar.getFirstDayOfWeek() == Calendar.MONDAY) {
            System.out.println("Monday is the first day of the week");
        }
        
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_YEAR, 2);
        calendar.roll(Calendar.HOUR_OF_DAY, 23);

        Date date = calendar.getTime();
        System.out.println(date);

    }
}
