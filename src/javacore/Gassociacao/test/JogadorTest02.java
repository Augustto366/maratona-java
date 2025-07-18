package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main (String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Santos");
        j1.setTime(time);
        j1.imprime();
    }
}
