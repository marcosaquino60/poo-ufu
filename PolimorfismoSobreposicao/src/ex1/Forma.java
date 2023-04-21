package ex1;

public class Forma {
    protected String identificador;
    protected String cor;

    public Forma(String identificador, String cor) {
        this.identificador = identificador;
        this.cor = cor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCor() {
        return cor;
    }
    public void mostrarDescricao() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Cor: " + cor);
    }
}
