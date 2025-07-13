package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;
import javacore.Bintroducaometodos.dominio.FuncionarioMetodos;

public class FuncionarioTest01 {
    public static void main (String[] args) {
        Funcionario funcionario01 = new Funcionario();
        FuncionarioMetodos funcionarioMetodos = new FuncionarioMetodos();

        funcionario01.setNome("Olavo");
        funcionario01.setIdade(33);
        funcionario01.setSalario(new double[]{1200, 1400, 3983});

        System.out.println(funcionario01.getNome() + "\n " + funcionario01.getIdade());
        funcionarioMetodos.mediaSalario(funcionario01.getSalario());
    }
}
