package javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file =  new File("test.txt");
        try(FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Testando arquivo Java para posteriormente ganhar mais de 10k. Quem sabe, 20k.");
            bw.newLine();
            bw.write("Nova linha");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
