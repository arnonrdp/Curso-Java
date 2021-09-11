package devdojo.maratonajava.javacore.f.modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe;
    // 1 - Alocado espaço em memória para o objeto;
    // 2 - Cada atributo de classe é criado e inicializado com valores default;
    // 3 - Bloco de inicialização é executado;
    // 4 - Contrutor é executado;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "\nAnime -> nome: " + nome + "\nepisodios: " + episodios + "\n";
    }

}
