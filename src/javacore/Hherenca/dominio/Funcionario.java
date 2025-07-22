package javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprimir () {
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
