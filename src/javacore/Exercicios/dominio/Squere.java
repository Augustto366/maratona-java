package javacore.Exercicios.dominio;

public class Squere implements CalcArea{
    private double l;

    public Squere(double l) {
        this.l = l;
    }

    @Override
    public double calcSizeArea() {
        return Math.pow(l, 2);
    }
}
