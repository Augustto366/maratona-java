package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.Repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioArquivo;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorioMem = new RepositorioMemoria();
        Repositorio repositorioArq = new RepositorioArquivo();
        Repositorio repositorioBD = new RepositorioBancoDeDados();
        repositorioMem.salvar();
        repositorioArq.salvar();
        repositorioBD.salvar();
    }
}
