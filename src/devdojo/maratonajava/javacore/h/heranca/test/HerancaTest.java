package devdojo.maratonajava.javacore.h.heranca.test;

import devdojo.maratonajava.javacore.h.heranca.domain.Endereco;
import devdojo.maratonajava.javacore.h.heranca.domain.Funcionario;
import devdojo.maratonajava.javacore.h.heranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 3", "47214-090");

        Pessoa pessoa1 = new Pessoa("Shurato", "123123465-78", endereco1);
        pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario("Antônio José", "678367836-010", endereco1, 2300);
        funcionario1.imprime();
    }
}
