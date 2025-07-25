package javacore.Exercicios.dominio;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo (String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    @Override
    public void calcularArea() {
       double area = this.altura * this.base;
        System.out.println("Retângulo: " + area);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
