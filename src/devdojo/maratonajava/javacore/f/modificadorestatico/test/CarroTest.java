package devdojo.maratonajava.javacore.f.modificadorestatico.test;

import devdojo.maratonajava.javacore.f.modificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Tesla", 400);
        Carro c2 = new Carro("BMW", 280);
        Carro c3 = new Carro("Mercedez", 320);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
