package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/augustto366/arquivo.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);

        System.out.println(posixFileAttributes);
    }
}
