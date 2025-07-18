package javacore.Gassociacao.dominio;

public class Team {

    private String name;
    private Player[] player;

    public Team (String name) {
        this.name = name;
    }

    public Team (String name, Player[] player) {
        this.name = name;
        this.player = player;
    }

    public void print () {
        System.out.println(this.name);
        if (player == null) {
            return;
        }
        for (Player arrayPlayer: player) {
            System.out.println(arrayPlayer.getName());
        }
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Player[] getPlayer () {
        return this.player;
    }

    public void setPlayer (Player[] player) {
        this.player = player;
    }

}
