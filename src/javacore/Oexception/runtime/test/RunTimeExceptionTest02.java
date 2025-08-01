package javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 0));
    }

    public static int divisao (int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return a / b;
    }
}
