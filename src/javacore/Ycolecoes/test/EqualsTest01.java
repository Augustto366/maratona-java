package javacore.Ycolecoes.test;

import javacore.Ycolecoes.test.domain.Smartphone;

public class EqualsTest01 {
    public static void main (String[] args) {
        /*String nome = "Augustto366";
        String nome2 = new String("Augustto366");
        System.out.println(nome.equals(nome2));*/

        Smartphone sp = new Smartphone("1ABC2", "iPhone");
        Smartphone sp2 = new Smartphone("1ABC2", "iPhone");
        System.out.println(sp.equals(sp2));
        System.out.println(sp.hashCode());
        System.out.println(sp2.hashCode());
    }
}
