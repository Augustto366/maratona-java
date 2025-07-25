package javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private ClienteTipo clienteTipo;
    private PagamentoTipo pagamentoTipo;
    private Roupa roupa;

    public Cliente(String nome, ClienteTipo clienteTipo, PagamentoTipo pagamentoTipo, Roupa roupa) {
        this.nome = nome;
        this.clienteTipo = clienteTipo;
        this.pagamentoTipo = pagamentoTipo;
        this.roupa = roupa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", clienteTipo=" + clienteTipo +
                ", clienteTipoInt=" + clienteTipo.valor +
                ", Roupa=" + roupa.getT() +
                ", pagamentoTipo=" + pagamentoTipo +
                '}';
    }
}
