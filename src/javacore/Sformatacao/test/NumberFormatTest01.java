package javacore.Sformatacao.test;

import javacore.Exercicios.dominio.Local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale ptbr = new Locale("pt", "br");
        Locale uk = Locale.UK;
        Locale jp = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(ptbr);
        nfa[2] = NumberFormat.getInstance(uk);
        nfa[3] = NumberFormat.getInstance(jp);
        double v = 10_000.000;
        for ( NumberFormat n: nfa) {
            System.out.println(n.format(v));
        }
    }
}
