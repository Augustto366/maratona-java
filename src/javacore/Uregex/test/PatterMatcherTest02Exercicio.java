package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02Exercicio {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-z])+)+";
        String texto = "luffy@hotmail.com.br, @#Hasg23@gmail.com, 123jotaro@gmail.com.tech, teste@gmail.com, sakura@mail";
        Pattern p = Pattern.compile(regex);
        System.out.println("Hasg23@gmail.com".matches(regex));
        System.out.println("@#Hasg23@gmail.com".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Matcher m = p.matcher(texto);
        while (m.find()){
            System.out.println(m.group());
        }

        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco
        // \S = excluí os espaços em branco
        // \w = a-ZA-Z, dígitos, -
        // \W = Tudo não incluso no anterior
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
    }
}
