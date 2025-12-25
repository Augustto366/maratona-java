package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(0);
        list.add(1);
        list.add(4);

        Collections.sort(list);

        System.out.println(list);
        //Binarysearch retorna o valor do índice onde o número está armazenado. No caso do zero, está no índice zero mesmo.
        System.out.println(Collections.binarySearch(list, 0));
    }
}
