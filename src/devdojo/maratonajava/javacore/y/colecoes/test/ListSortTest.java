package devdojo.maratonajava.javacore.y.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(6);
        animes.add("Dragon Ball Z");
        animes.add("Hellsing Ultimate");
        animes.add("Pokemon");
        animes.add("Berseck");
        animes.add("Attack on Titan");
        
        Collections.sort(animes);
        
        for (String anime : animes) {
            System.out.println(anime);
        }
    }
}
