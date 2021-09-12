package devdojo.maratonajava.javacore.g.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Sexo (M/F): ");
        char sexo = input.next().charAt(0);
        input.close();

        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
