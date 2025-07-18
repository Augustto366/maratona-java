package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Player;
import javacore.Gassociacao.dominio.Team;

public class PlayerGame {
    public static void main (String[] args) {
        Player player1 = new Player("Fallen");
        Player player2 = new Player("ColdZera");
        Player player3 = new Player("Boltz");
        Team team = new Team("MiBR");
        Team team2 = new Team("Liquid");
        Player[] players = {player1, player2};
        Player[] players2 = {player3};
        team.setPlayer(players);
        team2.setPlayer(players2);
        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team2);
        System.out.println("---Team---");
        team.print();
        System.out.println("---Team 2 ---");
        team2.print();
        System.out.println("---Player---");
        player1.print();
    }
}
