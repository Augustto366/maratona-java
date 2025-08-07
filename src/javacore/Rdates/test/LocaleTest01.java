package javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeUSA = new Locale("en", "us");
        Locale localeJapan = new Locale("ja", "jp");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeUSA);
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat1.format(calendar.getTime()));

        System.out.println(localeJapan.getDisplayCountry(localeUSA));
    }
}
