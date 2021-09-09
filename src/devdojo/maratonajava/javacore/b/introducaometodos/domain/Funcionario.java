package devdojo.maratonajava.javacore.b.introducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.println("Sem salário");
            return;
        }
        for (double salario : salarios) {
            System.out.println("Salários: " + salario);
        }

        mediaSalarial();
    }

    public void mediaSalarial() {
        if (salarios == null)
            return;
        for (double salario : salarios) {
            media += salario;
        }
        System.out.println("Média salarial: R$" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
    
}
