package javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        String s1 =  localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 =  localDate.format(DateTimeFormatter.ISO_DATE);
        String s3 =  localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s4 =  localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        LocalDate parse1 = LocalDate.parse("20250813", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterBR =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatterBR);
    }
}
