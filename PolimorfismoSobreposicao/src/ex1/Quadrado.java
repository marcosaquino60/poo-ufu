package ex1;

public class Quadrado extends FormaBidimensional {
    protected double lado;
    public Quadrado(String identificador, String cor, double coord_x, double coord_y, double lado) {
        super(identificador, cor, coord_x, coord_y);
        this.lado = lado;
    }
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Área: "+ obterArea());
    }
}
