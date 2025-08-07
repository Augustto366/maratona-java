package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.of(1969, 8, 17);
        LocalTime lt = LocalTime.of(18, 23, 55);
        LocalTime lt2 = LocalTime.parse("10:53:11");
        LocalDateTime ldt2 = ld.atTime(lt);
        LocalDateTime ldt3 = lt.atDate(ld);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
