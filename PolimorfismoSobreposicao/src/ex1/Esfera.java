package ex1;

public class Esfera extends FormaTridimensional {
    protected double raio;

    public Esfera(String identificador, String cor, double coord_x, double coord_y, double coord_z, double raio) {
        super(identificador, cor, coord_x, coord_y, coord_z);
        this.raio = raio;
    }
    public double obterVolume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
    boolean seIntercepta(Esfera outraEsfera) {
        double distanciaCentros = Math.sqrt(Math.pow(outraEsfera.coord_x - this.coord_x, 2) + Math.pow(outraEsfera.coord_y - this.coord_y, 2) + Math.pow(outraEsfera.coord_z - this.coord_z, 2));
        return distanciaCentros <= this.raio + outraEsfera.raio;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Esfera");
        System.out.println("Raio: "+ raio);
        System.out.println("Volume: " + obterVolume());
    }
}
