package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
  public static void main(String[] args) {
    // while, do while, for
    int count1 = 0;
    int count2 = 0;

    while (count1 < 10 || count2 < 10) {
      System.out.println(++count1 + " " + count2++);
    }

    do {
      System.out.println("\nDentro do While");
    } while (count1 < 10);

    System.out.println("Foor Loop: ");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // Todos os números pares de 0 até 1000
    for (int i = 0; i < 1000; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // Os primeiros 25 números de 0 a 50
    for (int i = 0; i < 50; i++) {
      if (i > 25)
        break;
      System.out.println(i);
    }

    // Veículo parcelado em 30 vezes
    double valorTotal = 30000;
    for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
      double valorParcela = valorTotal / parcela;
      if (valorParcela < 1000)
        continue;
      System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
    }
  }
}
