package devdojo.maratonajava.javacore.o.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "  + isCriado);
        } catch (IOException e) {
            // Será chamado caso o usuário não tenha permissão WRITE na pasta
            e.printStackTrace();
        }
    }
}
