package ex1;
import java.lang.Math;
public class Circulo extends FormaBidimensional{
    protected double raio;
    public Circulo(String identificador, String cor, double coord_x, double coord_y, double raio) {
        super(identificador, cor, coord_x, coord_y);
        this.raio = raio;
    }
    public double obterArea() {
        return Math.PI * (Math.pow(raio, 2));
    }
    boolean seIntercepta(Circulo outroCirculo) {
        double distanciaCentros = Math.sqrt(Math.pow(outroCirculo.coord_x - this.coord_x, 2) + Math.pow(outroCirculo.coord_y - this.coord_y, 2));
        return distanciaCentros <= this.raio + outroCirculo.raio;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Círculo");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + obterArea());
    }
}
