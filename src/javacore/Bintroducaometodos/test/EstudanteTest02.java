package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main (String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante01.nome = "Zé Bunitin";
        estudante01.idade = 37;
        estudante01.sexo = 'M';

        estudante02.nome = "Lara";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
