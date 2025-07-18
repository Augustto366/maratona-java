package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main (String[] args) {
        Jogador j1 = new Jogador("Cafu");
        Jogador j2 = new Jogador("Pelé");
        Jogador j3 = new Jogador("Ronaldo");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {j1,j2, j3};

        j1.setTime(time);
        j2.setTime(time);
        j3.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-------------");

        j2.imprime();


        System.out.println("-------------");

        time.imprime();



    }
}
