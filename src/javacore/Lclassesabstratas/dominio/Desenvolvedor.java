package javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario *= 1.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
