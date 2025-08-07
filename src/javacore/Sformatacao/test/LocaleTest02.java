package javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountrys = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String num: isoCountrys) {
            System.out.print(num);
        }
    }
}
