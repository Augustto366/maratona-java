package javacore.Npolimorfismo.dominio;

public class TV extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.18;

    public TV(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando imposto sobre a TV.");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
