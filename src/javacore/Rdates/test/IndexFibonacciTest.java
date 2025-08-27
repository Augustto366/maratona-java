package javacore.Rdates.test;

public class IndexFibonacciTest {
    public static void main(String[] args) {
        System.out.println(getIndex(10));

    }

    public static int getIndex (int index) {
        int f = 0;
        int x = 1;
        int fibonacci;
        int[] fib = new int[21];
        for (int i = 0; i <= 20 ; i++) {
            fibonacci = f + x;
            System.out.print(fibonacci + " ");
            fib[i] = fibonacci;
            f = x;
            x = fibonacci;
        }
        return fib[index];
    }
}
