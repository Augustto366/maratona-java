package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marcelo");
        names.add("Augusto");

        List<String> names2 = new ArrayList<>();
        names2.add("Marcelo");
        names2.add("Ash Kation");

        // put second list inside first and remove repeated content
       
        for(String name: names) {
            if (names2.contains(name)) {
                 names2.remove(name);
                 names.addAll(names2);
            }
         System.out.println(name);
        }

        System.out.println("----------------");

        /*for(int i = 0; i < names.size(); i++)  {
            System.out.println(names.get(i));
        }*/
    }
}
