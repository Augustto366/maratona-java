package javacore.Vio.test;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/augustto366/IdeaProjects/maratona-java/test.txt");
        try(FileReader fr = new FileReader(file) ) {
//            char[] in = new char[]{};
//                fr.read(in);
//            for (char c: in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                    System.out.print((char) i); // Converte (cast) de números para os devidos caracteres da tabela ASCII
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
