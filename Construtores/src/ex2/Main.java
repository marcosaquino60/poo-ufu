package ex2;

public class Main {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(19, 59, 59);
        t1.mostrarTempo();
        t1.mostrarTempoFormatado();
        t1.incrementaMinuto();
        t1.mostrarTempo();
        t1.mostrarTempoFormatado();
        Tempo t2 = new Tempo(20, 0, 0);
        t2.mostrarTempo();
        t2.mostrarTempoFormatado();
        t2.decrementaMinuto();
        t2.mostrarTempo();
        t2.mostrarTempoFormatado();
    }
}
