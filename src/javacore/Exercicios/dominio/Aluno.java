package javacore.Exercicios.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir () {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario () {
        return this.seminario;
    }

    public void setSeminario (Seminario seminario) {
        this.seminario = seminario;
    }
}
