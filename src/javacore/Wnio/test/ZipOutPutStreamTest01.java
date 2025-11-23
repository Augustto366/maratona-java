package javacore.Wnio.test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("pasta1/arquivo.zip");
        Path getP = Paths.get("pasta1/supasta1/subsubpasta1");
        zip(p1, getP);
    }

    private static void zip (Path arcZip, Path arcForZip) {
        try (ZipOutputStream z = new ZipOutputStream(Files.newOutputStream(arcZip)); DirectoryStream<Path> ds = Files.newDirectoryStream(arcForZip)) {
            for (Path file: ds) {
                ZipEntry ze = new ZipEntry(file.getFileName().toString());
                z.putNextEntry(ze);
                Files.copy(file, z);
                z.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
