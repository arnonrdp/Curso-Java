package devdojo.maratonajava.javacore.b.introducaometodos.test;

import devdojo.maratonajava.javacore.b.introducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.somarDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);
        double divisao = calculadora.divideDoisNumeros(20, 0);
        System.out.println(divisao);

        System.out.println("------------------");

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
