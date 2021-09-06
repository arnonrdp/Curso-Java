package devdojo.maratonajava.introducao;

/**
 * PRÁTICA: Crie variáveis para os campos descritos avaixo entre <> e imprima a
 * seguinte mensagem: Eu <nome>, morando no endereço <endereço>, confirmo que
 * recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
  public static void main(String[] args) {
    String nome = "Piccolo";
    String endereco = "Namekusen";
    Double salario = 800.00;
    String dataSalario = "22/09/2021";
    String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataSalario;
    
    System.out.println(relatorio);
  }
}
