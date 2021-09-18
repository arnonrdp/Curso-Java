package devdojo.maratonajava.javacore.j.modificadorfinal.domain;

public class Comprador {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome=" + nome;
    }

}
