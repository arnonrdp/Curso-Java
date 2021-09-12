package devdojo.maratonajava.javacore.g.associacao.test;

import devdojo.maratonajava.javacore.g.associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Roberto Carlos");

        Jogador[] jogadores = { jogador1, jogador2, jogador3 };

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
