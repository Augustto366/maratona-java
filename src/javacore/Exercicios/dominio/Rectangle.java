package javacore.Exercicios.dominio;

public class Rectangle implements CalcArea{
    private double base;
    private double hight;

    public Rectangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    @Override
    public double calcSizeArea() {
        return base * hight;
    }
}
