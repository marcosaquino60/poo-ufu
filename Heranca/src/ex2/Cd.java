package ex2;

public class Cd extends Midia {
    private String cantor;
    private int faixas;
    public Cd(String nome, String tipo, String genero, double preco, String cantor, int faixas) {
        super(nome, tipo, genero, preco);
        this.cantor = cantor;
        this.faixas = faixas;
    }

    public void showInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.printf("Preço: R$%.2f\n", getPreco());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cantor: " + cantor);
        System.out.println("Número de faixas: " + faixas);
    }
}
