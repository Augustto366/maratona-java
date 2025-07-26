package javacore.Minterfaces.dominio;

public interface DataLoader {
     static double data = 12;

    public abstract void load ();

    default void checkPermission () {
        System.out.println("Fazendo checagem de permissões.");
    }

     static void DataProcess () {
        System.out.println("Processando dados...");
    }
}
