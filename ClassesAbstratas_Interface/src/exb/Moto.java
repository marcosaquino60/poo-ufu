package exb;

public class Moto implements Veiculo{
    private String marca;
    private String modelo;
    private String cor;
    private int potencia;

    public Moto(String marca, String modelo, String cor, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    @Override
    public String marca() {
        return marca;
    }

    @Override
    public String modelo() {
        return modelo;
    }

    @Override
    public String cor() {
        return cor;
    }

    @Override
    public int potencia() {
        return potencia;
    }

    @Override
    public void mostraDados() {
        System.out.printf("%s %s (%s), %d cavalos de potência%n", marca, modelo, cor, potencia);
    }
}
