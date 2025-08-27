package javacore.Exercicios.exercicioArquivosDiretorios.test;

import java.io.*;
import java.util.Scanner;

public class ExercicioTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("Relatório.txt");
        file.createNewFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome, cargo e idade: ");
        String relatorio = scanner.nextLine();
        FileWriter fw = new FileWriter(file);
        fw.write(relatorio);
        fw.flush();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String f;
        while ((f = br.readLine()) != null) {
            System.out.println(f);
        }
    }
}
