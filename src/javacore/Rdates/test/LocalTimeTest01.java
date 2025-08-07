package javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(23, 59, 59);
        LocalTime lt2 = LocalTime.now();
        System.out.println(lt2);
        System.out.println(lt);
        System.out.println(lt2.getHour());
        System.out.println(lt2.getMinute());
        System.out.println(lt2.getSecond());
        System.out.println(lt2.getNano());
    }
}
