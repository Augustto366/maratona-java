package javacore.Exercicios.exercicioException01.dominio;

public class Celular extends Produto{
    private String marca;

    public Celular (String nome, double preco, String marca ) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
