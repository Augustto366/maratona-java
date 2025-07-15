package javacore.Fmodificadorestatico.dominio;

public class Anime {
    public String nome;
    public static int[] episodios;

    static {
        episodios = new int[100];
        System.out.println("Bloco de inicialização");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int num: Anime.episodios) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
