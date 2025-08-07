package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate ld = LocalDate.of(2025, Month.AUGUST, 7);
        LocalDate ld2 = LocalDate.now();
        LocalDate ld3 = LocalDate.MAX;
        LocalDate ld4 = LocalDate.MIN;
        System.out.println(ld);
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.isLeapYear());
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);

    }
}
