package javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ltd2 = LocalDateTime.now().plusYears(2);
        Duration d1 = Duration.between(ldt1, ltd2);
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.now().minusHours(11);
        Duration d2 = Duration.between(time, time2);
        System.out.println(d2);
        System.out.println(d1);
    }
}
