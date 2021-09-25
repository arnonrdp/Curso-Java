package devdojo.maratonajava.javacore.o.exception.runtime.test;

public class RuntimeException3 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.err.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
