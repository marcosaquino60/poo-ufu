package ex1;

public class Maquina {
    private String id;
    private int preco;
    private int qtdInserida;
    private int total;

    public Maquina(String id, int preco){
        this.preco = preco;
        this.id = id;
        qtdInserida = 0;
        total = 0;
    }
    public void insereDinheiro(int valor) {
        if(valor == 1 || valor == 2) {
            qtdInserida += valor;
            total += valor;
            System.out.println("Quantia de " + valor + " real(is) inserida com sucesso!");
        } else {
            System.out.println("Cédula de " + valor + " reais não é aceita pela máquina, por favor insira a de 2 ou 1 real(is)");
        }
    }
    public void emitirPassagem() {
        if(qtdInserida < preco) {
            System.out.println("Quantidade inserida insuficiente, insira mais " + (preco-qtdInserida) + " real(is).");
        }
        else {
            int troco = qtdInserida - preco;
            qtdInserida = 0;
            total = 0;
            System.out.println("Passagem emitida, troco: " + troco);
        }
    }
    public void mostrarPreco() {
        System.out.println("O preço da passagem é " + preco + ".");
    }
}
