package devdojo.maratonajava.javacore.d.construtores.test;

import devdojo.maratonajava.javacore.d.construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Dragon Ball", "TV", 360, "Ação", "K2");
        Anime anime2 = new Anime("Pokémon", "TV", 150, "Aventura", "Akira");

        System.out.println(anime1.toString());
        System.out.println(anime2.toString());
    }
}
