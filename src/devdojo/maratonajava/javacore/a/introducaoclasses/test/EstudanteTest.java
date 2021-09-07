package devdojo.maratonajava.javacore.a.introducaoclasses.test;

import devdojo.maratonajava.javacore.a.introducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        System.out.println("\nObjeto Com Atribuição:");
        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';
        System.out.println("Nome: " + estudante01.nome + ", Idade: " + estudante01.idade + ", Sexo: " + estudante01.sexo);
        System.out.println("Espaço na memória: " + estudante01);


        Estudante estudante02 = new Estudante();
        System.out.println("\nObjeto Sem Atribuição:");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
