package ex1;

public class Tetraedro extends FormaTridimensional {
    protected double base;
    protected double altura;
    protected double altura_base;
    public Tetraedro(String identificador, String cor, double coord_x, double coord_y, double coord_z, double base, double altura, double altura_base) {
        super(identificador, cor, coord_x, coord_y, coord_z);
        this.base = base;
        this.altura = altura;
        this.altura_base = altura_base;
    }
    public double obterVolume() {
        return (1/3) * altura_base * altura;
    }

    @Override
    public void mostrarDescricao() {
        super.mostrarDescricao();
        System.out.println("Tipo: Tetraedro");
        System.out.println("Base: "+ base);
        System.out.println("Altura: "+ altura);
        System.out.println("Altura da base: "+ altura_base);
        System.out.println("Volume: "+ obterVolume());
    }
}
