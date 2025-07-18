package javacore.Gassociacao.test;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {
    public static void main (String[] args) {
        Scanner asking = new Scanner(System.in);
        System.out.println("Wirite your name");
        String name = asking.nextLine();
        String nameUpper = name.substring(0,1).toUpperCase().concat(name.substring(1));
        System.out.println("Now, your age");
        int age = asking.nextInt();
        System.out.println("What's your sex? [M] or [F]");
        String sex = String.valueOf(asking.next().charAt(0));
        String sexUpper = sex.toUpperCase();
        if (!sexUpper.equals("F") && !sexUpper.equals("M")) {
            System.out.println("Please, just M or F.");
            return;
        }

        System.out.println("Name: " + nameUpper);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sexUpper);
    }
}
