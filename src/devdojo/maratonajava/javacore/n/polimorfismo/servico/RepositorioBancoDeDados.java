package devdojo.maratonajava.javacore.n.polimorfismo.servico;

import devdojo.maratonajava.javacore.n.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
