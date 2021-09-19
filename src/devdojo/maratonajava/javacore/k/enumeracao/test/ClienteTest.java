package devdojo.maratonajava.javacore.k.enumeracao.test;

import devdojo.maratonajava.javacore.k.enumeracao.domain.Cliente;
import devdojo.maratonajava.javacore.k.enumeracao.domain.TipoCliente;
import devdojo.maratonajava.javacore.k.enumeracao.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
