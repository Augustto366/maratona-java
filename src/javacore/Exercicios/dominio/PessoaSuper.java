package javacore.Exercicios.dominio;

public class PessoaSuper {
    private String nome;
    private String sobreNome;

    public PessoaSuper () {

    }

    public PessoaSuper (String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

}
