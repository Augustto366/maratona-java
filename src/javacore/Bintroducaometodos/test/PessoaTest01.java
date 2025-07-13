package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main (String[] args) {
        Pessoa pessoa =  new Pessoa();

        pessoa.setName("Stuart Litlle");
        pessoa.setAge(16);
       // pessoa.print();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
