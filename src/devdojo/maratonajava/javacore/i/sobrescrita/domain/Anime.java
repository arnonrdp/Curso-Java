package devdojo.maratonajava.javacore.i.sobrescrita.domain;

public class Anime extends Object {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    // O método `toString()` existe na classe Object;
    // A notação `@Override` indica que ele será sobrescrito
    @Override
    public String toString() {
        return "\nAnime -> nome: " + nome;
    }

}