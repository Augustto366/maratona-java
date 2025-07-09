package javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(1 + 1);
    }

    public void subtraiDoisNumeros () {
        System.out.println(10 - 8);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double n1, double n2) {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
        return n1/n2;
    }

    public void divideDoisNumeros02 (double n, double m) {
        if (n == 0 || m == 0) {
            System.out.println("Não é possível dividir por zero.");
            return;
        }
        System.out.println(n/m);
    }

    public void alteraDoisNumeros (int num1, int num2) {
        num1 = 30;
        num2 = 98;
        System.out.println("Dentro do método: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
