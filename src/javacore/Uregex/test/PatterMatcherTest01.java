package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    public static void main(String[] args) {
        /* String regex = "ab";
        String regex2 = "aba";
        String texto = "abaaba";
        String texto2 = "abababaa";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        } */

        /*String hasNumber = "My number phone_ @#$$%% is 5173234348 and my mama have a number too 192356562";
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher(hasNumber);

        while (m.find()) {
            System.out.print(m.group());
        }*/

        /*String rage = "abcuidjpokplliehucjdcjdvc145678jowkdowkduxmskcnjsdbcubshbcsushcbu";
        Pattern p = Pattern.compile("[a-i]");
        Matcher m = p.matcher(rage);
        while (m.find()){
            System.out.println(m.group());
        }

        int numberHex = 0x59F86A;
        System.out.println(numberHex);
         */
        String qtd = "abcuidjpokplliehucjdcjdvc74jowkdowkduxmskcnjsdbcubshbcsushcbu";
        Pattern pat = Pattern.compile("c([4|7])j");
        Matcher mat = pat.matcher(qtd);
        while (mat.find()){
            System.out.println(mat.group());
        }
    }
}
