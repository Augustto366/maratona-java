package javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola (String nome) {
        this.nome = nome;
    }

    public Escola (String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime () {
        System.out.println("Escola: " + this.nome);
        if (professores == null) {
            return;
        }
        for (Professor professor : professores) {
            System.out.println("Professore: " + professor.getNome());
        }
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores () {
        return this.professores;
    }

    public void setProfessores (Professor[] professores) {
        this.professores = professores;
    }
}
