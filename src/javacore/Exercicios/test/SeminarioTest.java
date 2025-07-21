package javacore.Exercicios.test;

import javacore.Exercicios.dominio.Aluno;
import javacore.Exercicios.dominio.Local;
import javacore.Exercicios.dominio.Professor;
import javacore.Exercicios.dominio.Seminario;

public class SeminarioTest {
    public static void main (String[] args) {
        Professor professor = new Professor("Samuel Cunha", "Biologia");
        Professor professor2 = new Professor("Gilileu Galilei", "Astronomia");
        Aluno aluno = new Aluno("João", 33);
        Aluno aluno2 = new Aluno("Guilherme", 26);
        Aluno[] alunos = {aluno, aluno2};
        Local local = new Local("Av. Tibidabo, 999 - Barcelona");

        Seminario seminario = new Seminario("Educação como base", local);
        Seminario seminario2 = new Seminario("Engenharia para o futuro", local);
        Seminario[] seminarios = {seminario, seminario2};
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        professor.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios);
        seminario.setAlunos(alunos);
        seminario2.setAlunos(alunos);
        seminario.setProfessor(professor);
        seminario2.setProfessor(professor2);

        seminario2.imprimir();



    }
}
