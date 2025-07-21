package javacore.Exercicios.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario (String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprimir () {
        System.out.println("Seminário: " + titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("--- Alunos ---");
        if (alunos.length != 0) {
            for (Aluno cont: alunos) {
                System.out.println("Aluno: " + cont.getNome());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado ainda.");
        }
        System.out.println("--- Professor ---");
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome());
        } else {
            System.out.println("Sem professor.");
        }
    }

    public String getTitulo () {
        return this.titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal () {
        return this.local;
    }

    public void setLocal (Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos () {
        return this.alunos;
    }

    public void setAlunos (Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor (Professor professor) {
        this.professor = professor;
    }
}
