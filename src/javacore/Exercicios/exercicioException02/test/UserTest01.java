package javacore.Exercicios.exercicioException02.test;

import javacore.Exercicios.exercicioException02.dominio.*;
import javacore.Exercicios.exercicioException02.exception.LoginIvalidoException;

public class UserTest01 {
    public static void main(String[] args) {
        Usuario usuario = new RecursosHumanosUser("rh123@gmail.com", "123456", "Ricardo", "00000000-9", Access.SUPER_USER);
        Usuario usuario2 = new AuxADMUser("auxadm123@gmail.com", "123456", "Júlia Machado", "009009237628-1", Access.REGISTER_ONLY);
        try {
            LoginUser.login(usuario2);
        } catch (LoginIvalidoException e) {
            e.printStackTrace();
        }

    }
}
