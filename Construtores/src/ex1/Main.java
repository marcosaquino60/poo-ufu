package ex1;

public class Main {
    public static void main(String[] args) {
        Maquina m1 = new Maquina("Moderninha", 3);
        m1.mostrarPreco();
        m1.insereDinheiro(1);
        m1.insereDinheiro(1);
        m1.emitirPassagem();

    }
}
