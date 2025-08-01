package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no BD.");
    }
}
