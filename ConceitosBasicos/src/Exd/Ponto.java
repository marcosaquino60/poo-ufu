package Exd;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inicializarCoords(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanciaEuclidiana(Ponto ponto2 ) {
        double difx = this.x - ponto2.x;
        double dify = this.y - ponto2.y;
        return Math.sqrt(Math.pow( difx,2 ) + Math.pow(dify, 2));
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(1.0, 2.0);
        Ponto p2 = new Ponto(3.0, 4.0);
        System.out.println(p1.distanciaEuclidiana(p2));
        p1.inicializarCoords(5.0, 6.0);
        System.out.println(p1.distanciaEuclidiana(p2));
    }
}
