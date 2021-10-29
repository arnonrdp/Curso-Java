package devdojo.maratonajava.javacore.y.colecoes.domain;

import java.util.Objects;

public class Anime implements Comparable<Anime> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Anime(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Anime(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Anime [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Anime anime = (Anime) obj;
        return Double.compare(anime.preco, preco) == 0 && id.equals(anime.id) && nome.equals(anime.nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Anime obj) {
        if (this.id < obj.getId())
            return -1;
        else if (this.id.equals(obj.getId()))
            return 0;
        else
            return 1;
    }

}
