package devdojo.maratonajava.javacore.b.introducaometodos.test;

import devdojo.maratonajava.javacore.b.introducaometodos.domain.Estudante;
import devdojo.maratonajava.javacore.b.introducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Kakaroto";
        estudante01.idade = 46;
        estudante01.sexo = 'M';
        estudante01.imprime();

        estudante02.nome = "Chichi";
        estudante02.idade = 40;
        estudante02.sexo = 'F';

        // impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
