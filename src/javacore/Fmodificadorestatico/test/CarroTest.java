package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main (String[] args) {
        Carro c1 = new Carro("Opala", 150);
        Carro c2 = new Carro("Fusca", 70);
        Carro c3 = new Carro("Aventador", 380);

        c1.setVelocidadeLimite(300);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
