package javacore.Exercicios.dominio;

public class Horista extends Funcionario2 {
    private double valorHora;

    public Horista (String nome, int horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas);
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "valorHora=" + valorHora +
                '}';
    }
}
