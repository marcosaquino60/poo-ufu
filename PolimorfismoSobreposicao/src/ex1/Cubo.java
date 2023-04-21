package ex1;

public class Cubo extends FormaTridimensional {
    protected double lado;

    public Cubo(String identificador, String cor, double coord_x, double coord_y, double coord_z, double lado) {
        super(identificador, cor, coord_x, coord_y, coord_z);
        this.lado = lado;
    }
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Cubo");
        System.out.println("Lado: "+ lado);
        System.out.println("Volume: " + obterVolume());
    }
}


