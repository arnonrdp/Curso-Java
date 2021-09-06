package devdojo.maratonajava.introducao;

public class Aula07Arrays {
  public static void main(String[] args) {
    String[] nomes = { "Goku", "Vegeta", "Piccolo", "Gohan", "Trunks" };

    // Utilizando For Loop
    System.out.println("\nFor Loop: ");
    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }

    // Utilizando For Each
    System.out.println("\nFor Each: ");
    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
