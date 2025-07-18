package javacore.Gassociacao.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main (String[] args) {
        Scanner asking = new Scanner(System.in);
        System.out.println("-- Welcome to The Genius -- ");
        System.out.println("Do some question");
        Random random = new Random();
        int n = random.nextInt(6);
        asking.nextLine();
        switch (n) {
            case 0, 1:
                System.out.println("Yes");
                break;
            case 2, 3:
                System.out.println("No");
                break;
            case 4, 5:
                System.out.println("Honestly, I don't no. Sorry.");
                break;
        }
    }
}
