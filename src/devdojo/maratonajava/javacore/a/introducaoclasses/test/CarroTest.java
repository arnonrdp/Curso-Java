package devdojo.maratonajava.javacore.a.introducaoclasses.test;

import devdojo.maratonajava.javacore.a.introducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Volkswagen";
        carro01.modelo = "Gol";
        carro01.ano = 2014;

        carro02.nome = "Porsche";
        carro02.modelo = "Cayman";
        carro02.ano = 1978;
    }
}
