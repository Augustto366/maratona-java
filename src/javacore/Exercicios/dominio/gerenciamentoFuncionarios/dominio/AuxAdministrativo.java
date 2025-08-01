package javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio;

public class AuxAdministrativo extends Funcionario{
    private String CRMSenha;

    public AuxAdministrativo(String nome, double salario, Cargo cargo, String CRMSenha) {
        super(nome, salario, cargo);
        this.CRMSenha = CRMSenha;
    }

    @Override
    public double calc(double desconto) {
        return this.salario * 0.13;
    }

    public String getCRMSenha() {
        return CRMSenha;
    }
}
