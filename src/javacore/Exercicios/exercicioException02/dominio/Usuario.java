package javacore.Exercicios.exercicioException02.dominio;

public abstract class Usuario {
    private String email;
    private String senha;
    private String nome;
    private String cpf;
    private Access access;


    public Usuario(String email, String senha, String nome, String cpf, Access access) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.access = access;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
