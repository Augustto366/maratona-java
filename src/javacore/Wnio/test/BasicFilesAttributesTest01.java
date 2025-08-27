package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Date;

public class BasicFilesAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/augustto366/arquivo.txt");
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(20);
        Files.createFile(path);
        FileTime fileTime = FileTime.from(localDateTime.toInstant(ZoneOffset.UTC));;
        Files.setLastModifiedTime(path, fileTime);
    }
}
