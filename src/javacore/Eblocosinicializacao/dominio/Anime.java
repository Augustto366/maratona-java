package javacore.Eblocosinicializacao.dominio;

public class Anime {
    public String nome;
    public int[] episodios;
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
        System.out.println();
    }
}
