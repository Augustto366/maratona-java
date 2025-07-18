package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Curso;
import javacore.Gassociacao.dominio.Universidade;

public class CursoTest01 {
    public static void main (String[] args) {
        Curso c1 = new Curso("Ciência da Computação");
        Curso c2 = new Curso("Engenharia Elétrica");
        Curso[] cursos = {c1,c2};
        Universidade universidade = new Universidade("Unisinos", cursos);

        universidade.imprime();
    }

}