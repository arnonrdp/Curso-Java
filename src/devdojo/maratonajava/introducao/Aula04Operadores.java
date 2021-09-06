package devdojo.maratonajava.introducao;

public class Aula04Operadores {
  public static void main(String[] args) {
    int numero01 = 10;
    int numero02 = 20;
    System.out.println("\nnumero01 = " + numero01);
    System.out.println("numero02 = " + numero02);
    
    //  + - * // %
    System.out.println("\nSoma: " + numero02 + numero01);
    System.out.println("Subtração: " + (numero02 - numero01));
    System.out.println("Multiplicação: " + numero02 * numero01);
    System.out.println("Divisão: " + numero02 / numero01);
    System.out.println("Resto: " + numero02 % numero01);

    //  == !=
    System.out.println("\nSão Iguais? " + (numero02 == numero01));
    System.out.println("São Diferentes? " + (numero02 != numero01));

    //  && ||
    System.out.println("\nnumero01 é igual a 10 E numero02 é igual a 20? " + (numero01 == 10 && numero02 == 20));
    System.out.println("numero01 é igual a 10 OU numero02 é igual a 10? " + (numero01 == 10 || numero02 == 20));

    //  += -= *= /= %=
    System.out.println("\nnumero02 += numero01: " + (numero02 += numero01));
    System.out.println("numero02 -= numero01: " + (numero02 -= numero01));
    System.out.println("numero02 *= numero01: " + (numero02 *= numero01));
    System.out.println("numero02 /= numero01: " + (numero02 *= numero01));
    System.out.println("numero02 %= numero01: " + (numero02 %= numero01));

    //  ++ --
    System.out.println("\nnumero01++  " + (numero01++) + "  // Imprime primeiro, soma depois");
    System.out.println("numero01--  " + (numero01--) + "  // Imprime primeiro, subtrai depois");
    System.out.println("++numero01  " + (++numero01) + "  // Soma primeiro, imprime depois");
    System.out.println("--numero01  " + (--numero01) + "  // Subtrai primeiro, imprime depois");
  }
}
