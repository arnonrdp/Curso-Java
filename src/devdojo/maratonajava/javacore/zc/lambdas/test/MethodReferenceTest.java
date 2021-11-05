package devdojo.maratonajava.javacore.zc.lambdas.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.maratonajava.javacore.zc.lambdas.domain.Anime;
import devdojo.maratonajava.javacore.zc.lambdas.service.AnimeComparators;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Yu-Gi-Oh!", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        System.out.println("--------------");
        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);
        System.out.println("--------------");
        animes.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animes);
        
    }
}
