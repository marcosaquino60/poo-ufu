package ex2;

public class Vhs extends Midia {
    private boolean rebobinada;
    public Vhs(String nome, String tipo, String genero, double preco, boolean rebobinada) {
        super(nome, tipo, genero, preco);
        this.rebobinada = rebobinada;
    }
    public void showInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.printf("Preço: R$%.2f\n", getPreco());
        System.out.println("Tipo: " + getTipo());
        if(rebobinada) {
            System.out.println("Está rebobinada");
        }
        else {
            System.out.println("Não está rebobinada");
        }
    }
}
