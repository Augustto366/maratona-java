package javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreate = fileDirectory.mkdir();
        File file = new File(fileDirectory, "novoArquivo.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isDirectoryCreate);
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDirectory, "arquivoRenomeado.txt");
        file.renameTo(fileRenamed);

        File DirectoryRenamed = new File("OtherPast");
        fileDirectory.renameTo(DirectoryRenamed);
    }
}
