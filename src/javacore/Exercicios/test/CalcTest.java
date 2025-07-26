package javacore.Exercicios.test;

import javacore.Exercicios.dominio.CalcArea;
import javacore.Exercicios.dominio.Circle;
import javacore.Exercicios.dominio.Rectangle;
import javacore.Exercicios.dominio.Squere;

public class CalcTest {
    public static void main(String[] args) {
        Squere squere1 = new Squere(4);
        Squere squere2 = new Squere(2);
        Rectangle rectangle = new Rectangle(16, 8);
        Rectangle rectangle2 = new Rectangle(14, 6);
        Circle circle = new Circle(3);

        CalcArea[] calcArea = new CalcArea[5];
        calcArea = new CalcArea[]{squere1, squere2, rectangle, rectangle2, circle};
        for (CalcArea num: calcArea) {
            System.out.println("Área: " + num.calcSizeArea());
        }
    }
}
