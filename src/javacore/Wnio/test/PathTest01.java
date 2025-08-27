package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/augustto366/IdeaProjects/maratona-java/OtherPast/path.txt");
        System.out.println(p1.getFileName().toFile().toPath());
    }
}
