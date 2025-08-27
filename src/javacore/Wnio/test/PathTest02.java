package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pathFolder = Paths.get("folder");
       /*if (Files.notExists(pathFolder)) {
            Path directory = Files.createDirectory(pathFolder);
        } else {
            System.out.println("Pasta já criada.");
        }

        if (Files.exists(pathFolder)) {
            Path subFolder = Paths.get("folder/subFolder/subSubFolder");
            Path directories = Files.createDirectories(subFolder);
        } else {
            System.out.println("A pasta não existe.");
        }*/
        Path subsub = Paths.get("folder/other/other2");
        Path c = Files.createDirectories(subsub);
        Path path = Paths.get(subsub.toString(), "here.txt");
        Path created = Files.createFile(path);
    }
}
