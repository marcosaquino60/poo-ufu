package ex1;

public class FormaBidimensional extends Forma {
    protected double coord_x;
    protected double coord_y;
    public FormaBidimensional(String identificador, String cor, double coord_x, double coord_y) {
        super(identificador, cor);
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }
    public double obterArea() {
        return coord_x * coord_y;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Coordenada X: " + coord_x);
        System.out.println("Coordenada Y: " + coord_y);
    }
}
