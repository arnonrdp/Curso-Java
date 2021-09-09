package devdojo.maratonajava.javacore.c.sobrecargametodos.teste;

import devdojo.maratonajava.javacore.c.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball", "TV", 12, "Ação");
        System.out.println(anime.toString());
        
    }
}
