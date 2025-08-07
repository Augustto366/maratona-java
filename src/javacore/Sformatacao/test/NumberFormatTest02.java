package javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale ptbr = new Locale("pt", "br");
        Locale uk = Locale.UK;
        Locale jp = Locale.JAPAN;
        Locale ch = Locale.CHINA;

        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(ptbr);
        nfa[2] = NumberFormat.getCurrencyInstance(uk);
        nfa[3] = NumberFormat.getCurrencyInstance(jp);
        nfa[4] = NumberFormat.getCurrencyInstance(ch);
        double v = 10_000.000;
        for ( NumberFormat n: nfa) {
            n.setMinimumFractionDigits(4);
            System.out.println(n.format(v));
        }

        String valueString =  "$10,000.0000";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
