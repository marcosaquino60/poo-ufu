package exc;

public class Vinho implements Produto {
    private int id;
    private int anoDeProducao;
    private String unidadeDeVenda;
    private String categoria;
    private double preco;

    public Vinho(int id, int anoDeProducao, double preco) {
        this.id = id;
        this.anoDeProducao = anoDeProducao;
        this.unidadeDeVenda = "garrafa";
        this.categoria = "vinho";
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public int getAnoDeProducao() {
        return anoDeProducao;
    }

    public String getUnidadeDeVenda() {
        return unidadeDeVenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}
