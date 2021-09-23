package devdojo.maratonajava.javacore.n.polimorfismo.servico;

import devdojo.maratonajava.javacore.n.polimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
