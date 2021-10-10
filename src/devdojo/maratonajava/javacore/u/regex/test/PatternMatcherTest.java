package devdojo.maratonajava.javacore.u.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println(" Texto: " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println(" Regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "); // 0 4 8
        }
    }
}
