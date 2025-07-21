package javacore.Exercicios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor (String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir () {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios != null) {
            for (Seminario cont: seminarios) {
                System.out.println("Seminário: " + cont.getTitulo());
            }
        }
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEspecialidade () {
        return this.especialidade;
    }

    public void setEspecialidade (String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios () {
        return this.seminarios;
    }

    public void setSeminarios (Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
