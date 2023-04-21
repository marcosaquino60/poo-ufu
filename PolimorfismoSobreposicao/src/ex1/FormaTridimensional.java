package ex1;

public class FormaTridimensional extends Forma{
    protected double coord_x;
    protected double coord_y;
    protected double coord_z;
    public FormaTridimensional(String identificador, String cor, double coord_x, double coord_y, double coord_z) {
        super(identificador, cor);
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.coord_z = coord_z;
    }

    public double obterVolume() {
        return coord_x * coord_y * coord_z;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Coordenada X: " + coord_x);
        System.out.println("Coordenada Y: " + coord_y);
        System.out.println("Coordenada Z: " + coord_z);
    }
}
