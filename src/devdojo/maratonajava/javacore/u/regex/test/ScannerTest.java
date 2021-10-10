package devdojo.maratonajava.javacore.u.regex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String texto1 = "Levi, Eren, Mikasa";
        String nomes1[] = texto1.split(",");
        for (String nome : nomes1) {
            System.out.println(nome.trim());
        }
    }
}
