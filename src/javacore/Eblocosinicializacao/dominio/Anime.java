package javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime (String nome) {
        this.nome = nome;
    }

    public Anime () {

        for (int num: this.episodios) {
            System.out.print(num + " ");
        }
    }
}
