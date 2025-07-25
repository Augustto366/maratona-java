package javacore.Exercicios.dominio;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

   public Pessoa (String nome, char sexo, int idade) {
       this.nome = nome;
       this.sexo = sexo;
       this.idade = idade;
   }

   public void imprimir () {
       System.out.println(this.nome);
       System.out.println(this.sexo);
       System.out.println(this.idade);
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
