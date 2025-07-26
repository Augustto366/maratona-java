package javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Dados transferidos do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Dados removidos do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no BD.");
    }
}
