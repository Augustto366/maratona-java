package javacore.Exercicios.dominio;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Triangulo (String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void calcularArea() {
        double area = (this.base * this.altura) / 2;
        System.out.println("Triângulo: " + area);
    }
}
