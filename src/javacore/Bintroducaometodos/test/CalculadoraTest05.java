package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5, 6};
        calculadora.somaArrays(numeros);
        System.out.println("-----------------");
        int[] numeros2 = {15, 17, 23};
        calculadora.somaVarArgs(numeros2);
    }
}
