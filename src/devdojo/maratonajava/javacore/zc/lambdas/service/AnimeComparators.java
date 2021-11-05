package devdojo.maratonajava.javacore.zc.lambdas.service;

import devdojo.maratonajava.javacore.zc.lambdas.domain.Anime;

public class AnimeComparators {

    private AnimeComparators() {
        throw new IllegalStateException("Utility class");
    }

    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
