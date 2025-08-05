package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "A77366";
        String passwordDB = "12345";
        System.out.println("Usuário: ");
        String userNameHere = scanner.nextLine();
        System.out.println("Senha: ");
        String passwordHere = scanner.nextLine();
        if (!userNameDB.equals(userNameHere) || !passwordDB.equals(passwordHere)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
