package javacore.Vio.test;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath()); // Mesma função do getAbsoluteFile
            System.out.println("Is a file? " + file.isFile());
            System.out.println("Is a directory? " + file.isDirectory());
            System.out.println("The last modified? " + new Date(file.lastModified()));
//            if (file.exists()) {
//                boolean isDeleted = file.delete();
//            } else {
//                System.out.println("Not exists");
//            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
