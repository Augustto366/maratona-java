package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        /*Path dri = Paths.get("home/augustto366");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dri.resolve(arquivo);
        System.out.println(resolve);
         */
        Path otherDri = Paths.get("home/augustto366");
        Path otherArc = Paths.get("/dev/arquivo.txt");
        Path resolve1 = otherDri.resolve(otherArc);
        System.out.println(resolve1);
    }
}
