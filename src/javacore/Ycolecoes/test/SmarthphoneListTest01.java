package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Ycolecoes.domain.Smartphone;

public class SmarthphoneListTest01 {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("1ABC2", "iPhone");
        Smartphone sp2 = new Smartphone("2HG45", "Motorola");
        Smartphone sp3 = new Smartphone("2HG45", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>(5);
        smartphones.add(sp);
        smartphones.add(sp2);
        smartphones.add(2, sp3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println(smartphones.contains(sp3));
        int index = smartphones.indexOf(sp3);
        System.out.println(smartphones.get(index));

    }
}
