package javacore.Hherenca.test;

import javacore.Hherenca.dominio.Endereco;
import javacore.Hherenca.dominio.Funcionario;
import javacore.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main (String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("02939434390");
        Pessoa pessoa = new Pessoa("Ken", "81829382734");
        pessoa.setCpf("002930232");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();
        System.out.println("----------");
        Funcionario funcionario = new Funcionario("Ryu", "273647593859");
        funcionario.setCpf("11122333");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprimir();
    }
}
