package javacore.Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "home/augustto366/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path = Paths.get(directory, arquivoTxt);
        System.out.println(path.normalize());
        boolean b = Files.exists(path);
        System.out.println(b);
    }
}
