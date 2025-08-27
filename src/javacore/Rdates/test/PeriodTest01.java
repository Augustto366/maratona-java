package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1930, 05, 9);
        Period p = Period.between(ld, ld2);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofMonths(48);
        Period p4 = Period.ofWeeks(38);
        System.out.println(p4);
    }
}
