package javacore.Exercicios.exercicioException02.dominio;

import javacore.Exercicios.exercicioException02.exception.LoginIvalidoException;

import java.util.Scanner;

public class LoginUser {

    public static void login(Usuario usuario) throws LoginIvalidoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email: ");
        String em = scanner.nextLine();
        System.out.println("Senha: ");
        String se = scanner.nextLine();
            if (!usuario.getEmail().equals(em) || !usuario.getSenha().equals(se) ) {
                throw new LoginIvalidoException("Email e/ou senha inválidos.");
            }
    }
}
