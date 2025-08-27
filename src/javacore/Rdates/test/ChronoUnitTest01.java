package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2002, Month.SEPTEMBER, 5, 23, 44, 53);
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(ldt, ldt2));
        System.out.println(ChronoUnit.WEEKS.between(ldt, ldt2));
        System.out.println(ChronoUnit.MONTHS.between(ldt, ldt2));
        System.out.println(ChronoUnit.DECADES.between(ldt, ldt2));

    }
}
