package devdojo.maratonajava.javacore.n.polimorfismo.servico;

import devdojo.maratonajava.javacore.n.polimorfismo.domain.Produto;
import devdojo.maratonajava.javacore.n.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof Tomate) {   
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
