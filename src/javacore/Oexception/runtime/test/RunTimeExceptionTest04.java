package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04  {
    public static void main(String[] args)  {
        try {
            System.out.println("Início");
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        }
        try {
            test();
            throw new SQLException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void test () throws IOException, SQLException {
        System.out.println("Oi");
    }

}
