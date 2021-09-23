package devdojo.maratonajava.javacore.n.polimorfismo.test;

import devdojo.maratonajava.javacore.n.polimorfismo.repository.Repositorio;
import devdojo.maratonajava.javacore.n.polimorfismo.servico.RepositorioArquivo;
import devdojo.maratonajava.javacore.n.polimorfismo.servico.RepositorioBancoDeDados;
import devdojo.maratonajava.javacore.n.polimorfismo.servico.RepositorioMemoria;

public class RepositorioText {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioBancoDeDados();
        Repositorio repositorio3 = new RepositorioMemoria();

        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
