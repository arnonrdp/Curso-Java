package devdojo.maratonajava.javacore.j.modificadorfinal.test;

import devdojo.maratonajava.javacore.j.modificadorfinal.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("Tesla");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        System.out.println(carro);
    }
}
