package ex2;

public class Midia {
    private String nome;
    private String tipo;
    private String genero;
    private double preco;

    public Midia(String nome, String tipo, String genero, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

}
