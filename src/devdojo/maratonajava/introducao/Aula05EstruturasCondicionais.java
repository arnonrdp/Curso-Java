package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
  public static void main(String[] args) {
    int idade = 15;
    boolean isMaiorIdade = idade >= 18;
    if (isMaiorIdade) {
      System.out.println("Autorizado a comprar bebida alcoólica");
    } else {
      System.out.println("\nNão pode comprar bebida alcoólica!\n");
    }

    // Dividindo idade por categorias
    String categoria = "";

    if (idade < 15) {
      categoria = "Categoria Infantil";
    } else if (idade >= 15 && idade < 18) {
      categoria = "Categoria Juvenil";
    } else {
      categoria = "Categoria Adulto";
    }
    System.out.println("Categoria: " + categoria);

    // Doar se salário for maior que 5000
    double salario = 6000;
    String mensagemDoar = "Vou doar 500 reais";
    String mensagemNaoDoar = "Ainda não posso doar";
    String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
    System.out.println("\nDoação: " + resultado);

    // Switch
    System.out.print("\nDia: ");
    byte dia = 5;
    switch (dia) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Opção Inválida");
        break;
    }

    System.out.print("\nSexo: ");
    char sexo = 'M';
    switch (sexo) {
      case 'M':
        System.out.println("Homem");
        break;
      case 'F':
        System.out.println("Mulher");
        break;
      default:
        System.out.println("Inválido");
        break;
    }
    System.out.println();
  }
}
