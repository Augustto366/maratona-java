package javacore.Hherenca.dominio;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimir () {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Endereço: " + endereco.getCep() + endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
