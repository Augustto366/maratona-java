package javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio;

public abstract class Funcionario implements DescontoSalario{
    protected String nome;
    protected double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo.getCargo();
    }
}
