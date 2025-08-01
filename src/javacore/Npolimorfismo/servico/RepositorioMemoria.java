package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados na memória.");
    }
}
