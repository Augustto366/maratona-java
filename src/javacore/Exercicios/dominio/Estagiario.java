package javacore.Exercicios.dominio;

public class Estagiario extends Funcionario2{
    private double bolsa;
    private int faltas;

    public Estagiario (String nome, double bolsa, int faltas) {
        super(nome);
        this.bolsa = bolsa;
        this.faltas = faltas;
    }

    @Override
    public double calcularSalario() {
       return bolsa - (faltas * 30);
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "bolsa=" + bolsa +
                ", faltas=" + faltas +
                '}';
    }
}
