package devdojo.maratonajava.javacore.q.string.test;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // L
        System.out.println(nome.length()); // 5
        System.out.println(nome.replace("f", "l")); // Lully
        System.out.println(nome.toLowerCase()); // luffy
        System.out.println(nome.toUpperCase()); // LUFFY
        System.out.println(numeros.length()); // 6
        System.out.println(numeros.substring(3)); // 345
        System.out.println(numeros.substring(0, 2)); // 01
        System.out.println(numeros.trim()); // Luffy // Remove valores em branco
    }
}
