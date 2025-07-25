package javacore.Kenum.dominio;

public enum PagamentoTipo {
        DEBITO {
            @Override
            public double calcularDesconto(double calcularDesconto) {
                return calcularDesconto * 0.1;
            }
        },
        CREDITO {
            @Override
            public double calcularDesconto(double calcularDesconto) {
                return calcularDesconto * 0.05;
            }
        };

    public abstract double calcularDesconto (double calcularDesconto);
}