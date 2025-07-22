package javacore.Exercicios.test;

import javacore.Exercicios.dominio.Funcionario;
import javacore.Exercicios.dominio.PessoaSuper;
import javacore.Exercicios.dominio.Prof;

public class Programa {
    public static void main (String[] args) {
        PessoaSuper pessoa1 = new PessoaSuper("João", "Medeiros");
        Funcionario pessoa2 = new Funcionario("Leonardo", "Messias");
        Prof pessoa3 = new Prof("Antônio", "Silva");

        pessoa2.setSalario(1000);
        pessoa3.setSalario(1500);
        System.out.println(pessoa2.getNome() + " "+ pessoa2.getSobreNome());
        System.out.println(pessoa2.getSalarioPrimeiraParcela());
        System.out.println(pessoa2.getSalarioSegundaParcela());
        System.out.println(pessoa3.getNome() + " "+ pessoa3.getSobreNome());
        System.out.println(pessoa3.getSalarioPrimeiraParcela());
        System.out.println(pessoa3.getSalarioSegundaParcela());

    }
}
