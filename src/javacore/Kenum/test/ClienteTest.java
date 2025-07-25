package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.ClienteTipo;
import javacore.Kenum.dominio.Roupa;
import javacore.Kenum.dominio.PagamentoTipo;

public class ClienteTest {
    public static void main (String[] args) {
        Cliente cliente = new Cliente("Felipe", ClienteTipo.PESSOA_FISICA, PagamentoTipo.DEBITO, Roupa.SOCIAL);
        Cliente cliente2 = new Cliente("Lorrana", ClienteTipo.PESSOA_JURIDICA, PagamentoTipo.CREDITO, Roupa.SOCIAL);
        Cliente cliente3 = new Cliente("João", ClienteTipo.PESSOA_FISICA, PagamentoTipo.CREDITO, Roupa.TERNO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(PagamentoTipo.CREDITO.calcularDesconto(100));
        ClienteTipo clienteTipo = ClienteTipo.porNomeRelatorio("Pessoa Jurídica");
        System.out.println(clienteTipo);
    }
}
