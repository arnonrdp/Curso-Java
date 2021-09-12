package devdojo.maratonajava.javacore.g.associacao.test;

import devdojo.maratonajava.javacore.g.associacao.domain.Jogador;
import devdojo.maratonajava.javacore.g.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
