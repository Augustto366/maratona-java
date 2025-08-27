package javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file =  new File("test.txt");
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Testando arquivo Java para posteriormente ganhar mais de 10k.");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
