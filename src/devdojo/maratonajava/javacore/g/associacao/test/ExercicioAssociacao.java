package devdojo.maratonajava.javacore.g.associacao.test;

import devdojo.maratonajava.javacore.g.associacao.exercicio.Aluno;
import devdojo.maratonajava.javacore.g.associacao.exercicio.Local;
import devdojo.maratonajava.javacore.g.associacao.exercicio.Professor;
import devdojo.maratonajava.javacore.g.associacao.exercicio.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Hogwarts");

        Professor professor = new Professor("Alvo Dumbledore", "Magia");

        Aluno aluno1 = new Aluno("Harry", 12);
        Aluno aluno2 = new Aluno("Rony", 11);
        Aluno aluno3 = new Aluno("Hermione", 13);
        Aluno[] alunosParaSeminario = { aluno1, aluno2, aluno3 };

        Seminario seminario = new Seminario("Regras da Escola de Magia", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis = { seminario };

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
