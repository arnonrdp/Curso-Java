package devdojo.maratonajava.javacore.y.colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import devdojo.maratonajava.javacore.y.colecoes.domain.Anime;

public class IteratorTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(6);
        animes.add(new Anime(5L, "Naruto", 19.9, 0));
        animes.add(new Anime(6L, "Dragon Ball", 17.9, 5));
        animes.add(new Anime(1L, "One Piece", 15.9, 11));
        animes.add(new Anime(2L, "Bleach", 13.9, 0));
        animes.add(new Anime(3L, "Gintama", 11.9, 2));
        animes.add(new Anime(4L, "Fairy Tail", 9.9, 0));

        Iterator<Anime> iterator = animes.iterator();
        while (iterator.hasNext()) {
            Anime anime = iterator.next();
            if (anime.getQuantidade() == 0) {
                System.out.println(anime);
            }
        }
    }
}
