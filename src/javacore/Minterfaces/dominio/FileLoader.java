package javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Dados transferidos de um arquivo.");
    }

    @Override
    public void remove() {
        System.out.println("Dados removidos do arquivo.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do arquivo.");
    }
}
