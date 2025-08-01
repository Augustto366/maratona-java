package javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio;

public class Gerente extends Funcionario{
    private String idCard;

    public Gerente(String nome, double salario, Cargo cargo, String idCard) {
        super(nome, salario, cargo);
        if (idCard.length() == 4) {
            this.idCard = idCard;
        } else {
            this.idCard = "Por favor, corrigir a senha o quanto antes.";
        }
    }

    @Override
    public double calc(double desconto) {
        return this.salario * 0.31;
    }

    public String getIdCard() {
        return idCard;
    }
}
