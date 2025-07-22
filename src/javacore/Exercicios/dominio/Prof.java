package javacore.Exercicios.dominio;

public class Prof extends Funcionario {

    public Prof (String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
