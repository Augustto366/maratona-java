package javacore.Exercicios.dominio.gerenciamentoFuncionarios.servico;

import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.AuxAdministrativo;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.Funcionario;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.Gerente;

public class FuncionariosConfig {


    public static void relatorio (Funcionario funcionario) {
        double calcDesc = funcionario.calc(funcionario.getSalario());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário (com descontos aplicados): " + (funcionario.getSalario() - calcDesc));
        if (funcionario instanceof AuxAdministrativo) {
            AuxAdministrativo auxAdministrativo = (AuxAdministrativo) funcionario;
            System.out.println("Senha para acessar CRM: " + auxAdministrativo.getCRMSenha());
        } else if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente)funcionario;
            System.out.println("Identificação: " + gerente.getIdCard());
        }
    }
}
