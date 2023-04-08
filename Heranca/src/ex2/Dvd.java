package ex2;
import java.util.ArrayList;
public class Dvd extends Midia {
    private ArrayList<String> atores;
    private String diretor;
    private int duracao;

    public Dvd(String nome, String tipo, String genero, double preco, ArrayList<String> atores, String diretor, int duracao) {
        super(nome, tipo, genero, preco);
        this.atores = atores;
        this.diretor = diretor;
        this.duracao = duracao;
    }
    public void showInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.printf("Preço: R$%.2f\n", getPreco());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Atores: " + String.join(", ", atores));
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " horas");
    }
}
