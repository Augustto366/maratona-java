package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class Professor01 {
    public static void main (String[] args) {
        Professor professor = new Professor("Ash");
        Professor prof2 = new Professor("Broke");
        Professor[] professors = {professor, prof2};
        Escola escola = new Escola("Champing", professors);

        escola.imprime();
    }
}
