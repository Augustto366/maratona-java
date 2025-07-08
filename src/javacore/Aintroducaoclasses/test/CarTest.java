package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main (String[] args) {
        Car car = new Car();
        car.name = "Palio";
        car.model = "FIAT";
        car.year = 2007;

        Car car2 = new Car();
        car2.name = "HB20";
        car2.model = "Hyndai";
        car2.year = 2014;

        System.out.println("Carro: " + car.name + " Modelo: " + car.model + " Ano: " + car.year);
        System.out.println("Carro: " + car2.name + " Modelo: " + car2.model + " Ano: " + car2.year);

    }
}
