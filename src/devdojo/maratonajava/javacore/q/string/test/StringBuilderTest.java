package devdojo.maratonajava.javacore.q.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Arnon Rodrigues";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome); // Arnon Rodrigues
        StringBuilder sb = new StringBuilder("Arnon Rodrigues");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb); // Arnon Rodrigues DevDojo Academy
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb); // on Rodrigues DevDojo Academy
    }
}