package devdojo.maratonajava.javacore.j.modificadorfinal.domain;

public class Carro {
    private String marca;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro [COMPRADOR=" + COMPRADOR.toString() + ", marca=" + marca + "]";
    }

}
