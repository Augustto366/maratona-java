package javacore.Exercicios.dominio;

public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica (String nome) {
        this.nome = nome;
    }

    public abstract void calcularArea ();
}
