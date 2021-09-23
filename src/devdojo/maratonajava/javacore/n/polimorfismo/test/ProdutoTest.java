package devdojo.maratonajava.javacore.n.polimorfismo.test;

import devdojo.maratonajava.javacore.n.polimorfismo.domain.Computador;
import devdojo.maratonajava.javacore.n.polimorfismo.domain.Televisao;
import devdojo.maratonajava.javacore.n.polimorfismo.domain.Tomate;
import devdojo.maratonajava.javacore.n.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate1 = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate1);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("--------------------------------");

        Tomate tomate2 = new Tomate("Americano", 20);
        tomate2.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate2);
    }
}
