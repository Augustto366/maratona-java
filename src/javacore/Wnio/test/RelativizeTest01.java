package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/augustto366");
        Path clazz = Paths.get("/home/augustto366/dev/helloWorld.java");
        Path relativize = dir.relativize(clazz);
        System.out.println(relativize);

        Path dir2 = Paths.get("/home/augustto366");
        Path clazz2 = Paths.get("temp");
        Path relativize2 = dir2.relativize(clazz2);
    }
}
