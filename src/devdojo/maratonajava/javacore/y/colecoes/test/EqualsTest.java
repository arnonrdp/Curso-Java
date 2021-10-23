package devdojo.maratonajava.javacore.y.colecoes.test;

import devdojo.maratonajava.javacore.y.colecoes.domain.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("ABC1", "iPhone");
        Smartphone s2 = new Smartphone("ABC1", "iPhone");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
