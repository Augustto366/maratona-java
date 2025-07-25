package javacore.Kenum.dominio;

public enum ClienteTipo {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int valor;
    private String nomeRelatorio;

    ClienteTipo(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static ClienteTipo porNomeRelatorio (String nomeRelatorio) {
        for (ClienteTipo value : values()) {
            if (value.getNomeRelatorio().equals(nomeRelatorio)) {
                return value;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
