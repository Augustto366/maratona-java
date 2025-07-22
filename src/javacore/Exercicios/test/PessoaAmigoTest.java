package javacore.Exercicios.test;

import javacore.Exercicios.dominio.Amigo;
import javacore.Exercicios.dominio.Pessoa;

public class PessoaAmigoTest {
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa("Potato", 'M', 73);
        Amigo amigo = new Amigo("Jubileu", 'M', 68, "29/02/1952");
        pessoa.imprimir();
        amigo.imprimir();
    }
}
