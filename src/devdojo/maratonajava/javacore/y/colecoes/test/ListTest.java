package devdojo.maratonajava.javacore.y.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Arnon");
        nomes.add("Dari");
        nomes.add("Oliveira");
        
        System.out.println(nomes);
        System.out.println("------------");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.remove("Oliveira");
        System.out.println("------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        System.out.println("------------");
        System.out.println(numeros);
    }
}
