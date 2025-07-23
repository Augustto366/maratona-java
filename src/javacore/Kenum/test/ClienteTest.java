package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.ClienteTipo;

public class ClienteTest {
    public static void main (String[] args) {
        Cliente cliente = new Cliente("Felipe", ClienteTipo.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Lorrana", ClienteTipo.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("João", ClienteTipo.PESSOA_FISICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente.getClienteTipo());

    }
}
