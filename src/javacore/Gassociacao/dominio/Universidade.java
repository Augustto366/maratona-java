package javacore.Gassociacao.dominio;

public class Universidade {
    private String nome;
    private Curso[] cursos;

    public Universidade (String nome) {
        this.nome = nome;
    }

    public Universidade (String nome, Curso[] curso) {
        this.nome = nome;
        this.cursos = curso;
    }

    public void imprime () {
        System.out.println(this.nome);
        if (cursos == null) {
            return;
        }
        for (Curso curso: cursos) {
            System.out.println("Curso: " + curso.getNome());
        }
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public Curso[] getCurso () {
        return this.cursos;
    }

    public void setCurso (Curso[] curso) {
        this.cursos = curso;
    }
}
