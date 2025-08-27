package javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("pasta/subpasta/arc.txt");
        Path p2 = Paths.get("pasta/subpasta/arc2.txt");
        Path p3 = Paths.get("pasta/subpasta/arc3.txt");
        matches(p1, "glob:*.txt");
        matches(p1, "glob:**.txt");
    }

    private static void matches (Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
