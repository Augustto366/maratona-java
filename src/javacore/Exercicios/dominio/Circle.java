package javacore.Exercicios.dominio;

public class Circle implements CalcArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSizeArea() {
        return Math.PI * radius;
    }
}
