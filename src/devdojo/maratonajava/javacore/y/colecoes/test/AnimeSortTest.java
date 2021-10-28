package devdojo.maratonajava.javacore.y.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import devdojo.maratonajava.javacore.y.colecoes.domain.Anime;

public class AnimeSortTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(6);
        animes.add(new Anime(2L, "Dragon Ball Z", 2.99));
        animes.add(new Anime(5L, "Hellsing Ultimate", 19.9));
        animes.add(new Anime(4L, "Pokemon", 3.2));
        animes.add(new Anime(1L, "Berseck", 9.5));
        animes.add(new Anime(3L, "Attack on Titan", 11.20));

        for (Anime anime : animes) {
            System.out.println(anime);
        }
        System.out.println("-----------------------------");
        Collections.sort(animes);

        for (Anime anime : animes) {
            System.out.println(anime);
        }
    }
}
