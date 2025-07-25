package javacore.Exercicios.test;

import javacore.Exercicios.dominio.Estagiario;
import javacore.Exercicios.dominio.Horista;

public class GestãoTest {
    public static void main(String[] args) {
        Horista horista = new Horista("Fernando", 33, 7.35);
        Estagiario estagiario = new Estagiario("Lola", 800, 3);
        horista.exibirResumo();
        estagiario.exibirResumo();
    }
}
