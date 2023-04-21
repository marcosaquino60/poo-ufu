package ex1;

public class Triangulo extends FormaBidimensional {
    protected double base;
    protected double altura;
    public Triangulo(String identificador, String cor, double coord_x, double coord_y, double base, double altura) {
        super(identificador, cor, coord_x, coord_y);
        this.base = base;
        this.altura = altura;
    }
    public double obterArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Triãngulo");
        System.out.println("Base: "+ base);
        System.out.println("Altura: "+ altura);
    }
}
