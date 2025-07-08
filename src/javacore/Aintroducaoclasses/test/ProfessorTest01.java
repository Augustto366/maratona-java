package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main (String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcelo";
        professor.idade = 22;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
