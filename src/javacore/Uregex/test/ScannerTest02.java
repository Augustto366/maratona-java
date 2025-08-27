package javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String nomes = "Marcelo, Augusto, da Silva, 377";
        Scanner scanner = new Scanner(nomes);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
