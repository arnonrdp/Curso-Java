package devdojo.maratonajava.javacore.l.classesabstratas.test;

import devdojo.maratonajava.javacore.l.classesabstratas.domain.Desenvolvedor;
import devdojo.maratonajava.javacore.l.classesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
