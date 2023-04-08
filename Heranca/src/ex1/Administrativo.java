package ex1;

public class Administrativo extends Funcionario {
    private double horas;
    private double horaextra;
    public Administrativo(String nome, String rg, double salario) {
        super(nome, rg, salario);
        horas = 0;
        horaextra = 0.01 * salario;
    }

    public void adicionarHoras(double horas) {
        this.horas += horas;
    }

    public double getHoras() {
        return horas;
    }

    public double calculaSalario() {
        double salario = getSalario() + (getHoras() * horaextra);
        horas = 0;
        return salario;
    }
}
