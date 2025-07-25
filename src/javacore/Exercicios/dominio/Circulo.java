package javacore.Exercicios.dominio;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo (String nome, double raio) {
        super(nome);
        this.raio = raio;
        calcularArea();
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public void calcularArea() {
        double area = 3.14 * Math.pow(raio, 2);
        System.out.println("Círculo: " + area);
    }
}
