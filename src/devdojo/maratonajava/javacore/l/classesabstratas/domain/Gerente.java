package devdojo.maratonajava.javacore.l.classesabstratas.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente [nome: " + nome + " / salário: " + salario + "]";
    }

    @Override
    public void calculaBonus() {
        this.salario *= 1.1;
    }

}
