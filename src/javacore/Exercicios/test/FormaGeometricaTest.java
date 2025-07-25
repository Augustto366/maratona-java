package javacore.Exercicios.test;

import javacore.Exercicios.dominio.Circulo;
import javacore.Exercicios.dominio.Retangulo;
import javacore.Exercicios.dominio.Triangulo;

public class FormaGeometricaTest {
    public static void main (String[] args) {
        Circulo circulo = new Circulo("Círculo", 2);
        Retangulo retangulo = new Retangulo("Retangulo",12, 6);
        Triangulo triangulo = new Triangulo("Triangulo", 8, 11);
    }
}
