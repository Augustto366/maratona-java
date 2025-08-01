package javacore.Exercicios.dominio.gerenciamentoFuncionarios.test;

import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.AuxAdministrativo;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.Cargo;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.Funcionario;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio.Gerente;
import javacore.Exercicios.dominio.gerenciamentoFuncionarios.servico.FuncionariosConfig;

public class GerenciadorApp {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Carlos Souza", 12873, Cargo.GERENTE,"FX23");
        Funcionario f2 = new AuxAdministrativo("Carol", 1653, Cargo.AUX_ADM, "Senha123");

        FuncionariosConfig.relatorio(f1);
        System.out.println("---------------");
        FuncionariosConfig.relatorio(f2);
    }
}
