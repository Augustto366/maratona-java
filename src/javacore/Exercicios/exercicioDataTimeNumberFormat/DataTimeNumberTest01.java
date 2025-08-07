package javacore.Exercicios.exercicioDataTimeNumberFormat;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DataTimeNumberTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        formulation(pessoa);
    }

    public static class Pessoa {
        private String nome;
        private String email;

        public String getNome () {
            return nome;
        }

        public String getEmail () {
            return email;
        }

        public void setNome (String nome) {
            this.nome = nome;
        }

        public void setEmail (String email) {
            this.email = email;
        }
    }

    public static void formulation(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Qual seu nome?");
        String nomeDigitado = scanner.next();
        pessoa.setNome(nomeDigitado);
        System.out.println("Qual seu email?");
        String emailDigitado = scanner.next();
        pessoa.setEmail(emailDigitado);

        System.out.println("Usuário " + pessoa.getNome() + " com email " + pessoa.getEmail() + " em " + dt.getDayOfWeek() + "/" + dt.getHour());
    }
}
