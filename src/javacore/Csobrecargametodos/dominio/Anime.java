package javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epds;

    public void init (String nome, String tipo, int epds) {
        this.nome = nome;
        this.tipo = tipo;
        this.epds = epds;
    }

    public void imprimir () {
        System.out.println(this.tipo);
        System.out.println(this.epds);
        System.out.println(this.nome);
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

    public String getTipo () {
        return this.tipo;
    }

    public void setEpds (int epds) {
        this.epds = epds;
    }

    public int getEpds () {
        return this.epds;
    }

}
