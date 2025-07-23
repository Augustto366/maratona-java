package javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private ClienteTipo clienteTipo;

    public Cliente(String nome, ClienteTipo clienteTipo) {
        this.clienteTipo = clienteTipo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", clienteTipo=" + clienteTipo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteTipo getClienteTipo() {
        return clienteTipo;
    }

    public void setClienteTipo(ClienteTipo clienteTipo) {
        this.clienteTipo = clienteTipo;
    }
}
