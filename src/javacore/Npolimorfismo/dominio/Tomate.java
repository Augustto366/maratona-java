package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String validade;

    public Tomate(String nome, double valor, String validade) {
        super(nome, valor);
        this.validade = validade;
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando imposto sobre o tomate.");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getValidade() {
        return validade;
    }

}
