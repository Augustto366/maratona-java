package javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/augustto366/IdeaProjects/maratona-java/test.txt");
        try(FileReader fr = new FileReader(file) ) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
