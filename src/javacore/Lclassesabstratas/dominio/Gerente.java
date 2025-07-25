package javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario *= 1.05;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
