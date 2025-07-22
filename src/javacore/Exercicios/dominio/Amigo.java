package javacore.Exercicios.dominio;

public class Amigo extends Pessoa{
    private String diaDoaniversario;

    public Amigo (String nome, char sexo, int idade, String diaDoaniversario) {
        super(nome, sexo, idade);
        this.diaDoaniversario = diaDoaniversario;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(getDiaDoaniversario());
    }

    public String getDiaDoaniversario() {
        return diaDoaniversario;
    }

    public void setDiaDoaniversario(String diaDoaniversario) {
        this.diaDoaniversario = diaDoaniversario;
    }
}
