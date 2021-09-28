package devdojo.maratonajava.javacore.q.string.test;

public class StringTest1 {
    public static void main(String[] args) {
        String nome1 = "Arnon"; // String constant pool
        String nome2 = "Arnon";
        String nome3 = new String("Arnon");

        nome1.concat(" Rodrigues");
        System.out.println(nome1); // Arnon
        System.out.println(nome1 == nome2); // true
        
        nome1 = nome1.concat(" Rodrigues");
        System.out.println(nome1); // Arnon Rodrigues
        System.out.println(nome1 == nome2); // false

        System.out.println(nome2 == nome3); // false
        System.out.println(nome2 == nome3.intern()); // true
    }
}
