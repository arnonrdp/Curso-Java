package devdojo.maratonajava.javacore.b.introducaometodos.test;

import devdojo.maratonajava.javacore.b.introducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.setNome("Kaiô");
        funcionario1.setIdade(426);
        funcionario1.setSalarios(new double[] { 2000, 2123.67, 9430.11 });

        funcionario2.setNome("Kamisama");
        funcionario2.setIdade(120);
        funcionario2.setSalarios(new double[] { 5430, 223.37, 4340.43 });

        funcionario1.imprimir();
        funcionario2.imprimir();
    }
}
