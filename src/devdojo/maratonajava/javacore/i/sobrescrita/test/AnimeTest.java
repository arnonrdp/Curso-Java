package devdojo.maratonajava.javacore.i.sobrescrita.test;

import devdojo.maratonajava.javacore.i.sobrescrita.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Dragon Ball");
        Anime anime2 = new Anime("Yu-gi-oh!");
        Anime anime3 = new Anime("Shurato");

        System.out.println(anime1);
        System.out.println(anime2);
        System.out.println(anime3);
    }
}