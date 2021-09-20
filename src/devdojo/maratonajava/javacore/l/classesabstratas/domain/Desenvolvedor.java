package devdojo.maratonajava.javacore.l.classesabstratas.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome: " + nome + " / salário: " + salario + "]";
    }

    @Override
    public void calculaBonus() {
        this.salario *= 1.2;
    }

}
