package javacore.Exercicios.dominio;

public abstract class Funcionario2 {
    private String nome;
    protected int horasTrabalhadas;

    public Funcionario2 (String nome) {
        this.nome = nome;
    }

    public Funcionario2(String nome, int horasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract double calcularSalario ();

    public void exibirResumo () {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário: " + calcularSalario());
    }
}
