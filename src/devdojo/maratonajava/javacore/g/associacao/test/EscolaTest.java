package devdojo.maratonajava.javacore.g.associacao.test;

import devdojo.maratonajava.javacore.g.associacao.domain.Escola;
import devdojo.maratonajava.javacore.g.associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = { professor1, professor2 };
        Escola escola = new Escola("Fundação Osório", professores);

        escola.imprime();
    }
}
