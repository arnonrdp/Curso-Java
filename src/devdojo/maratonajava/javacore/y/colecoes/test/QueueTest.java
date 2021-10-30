package devdojo.maratonajava.javacore.y.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import devdojo.maratonajava.javacore.y.colecoes.domain.Anime;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Anime> animes = new PriorityQueue<>();
        animes.add(new Anime(5L, "Naruto", 19.9, 0));
        animes.add(new Anime(6L, "Dragon Ball", 17.9, 5));
        animes.add(new Anime(1L, "One Piece", 15.9, 11));
        animes.add(new Anime(2L, "Bleach", 13.9, 0));
        animes.add(new Anime(3L, "Gintama", 11.9, 2));
        animes.add(new Anime(4L, "Fairy Tail", 9.9, 0));

        while (!animes.isEmpty()) {
            System.out.println(animes.poll());
        }
    }
}
