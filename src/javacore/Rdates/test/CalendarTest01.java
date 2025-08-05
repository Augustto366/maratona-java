package javacore.Rdates.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão!");
        }
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c.getTime());
    }
}
