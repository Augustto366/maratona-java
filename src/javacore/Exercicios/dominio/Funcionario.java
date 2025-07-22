package javacore.Exercicios.dominio;

public class Funcionario extends PessoaSuper{

    private int matricula;
    private double salario;

    public Funcionario (String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            return;
        }
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela () {
        return getSalario() * 0.60;
    }

    public double getSalarioSegundaParcela () {
        return getSalario() * 0.40;
    }
}
