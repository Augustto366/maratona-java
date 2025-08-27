package javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2025, 8, 7);
        System.out.println("Dia: " + now + "(" + now.getDayOfWeek() + ")");
        now = nextUtil(now);
        System.out.println("Pŕoximo dia útil: " + now + "(" + now.getDayOfWeek() + ")");
    }

    public static LocalDate nextUtil (LocalDate date) {
        if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY) || date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        } else if (date.getDayOfWeek().equals(DayOfWeek.THURSDAY)){
            return date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        } else  {
            return date.plusDays(1);
        }
    }
}
