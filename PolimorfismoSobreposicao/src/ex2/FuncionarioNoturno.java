package ex2;

public class FuncionarioNoturno extends Funcionario{
    private int noitesTrabalhadas;
    private double addNoturno;
    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, double salarioBase) {
        super(matricula, nome, cpf, idade, salarioBase);
        this.addNoturno = 0.5;
        this.noitesTrabalhadas = 0;
    }
    public void computaNoites(int noites) {
        noitesTrabalhadas += noites;
    }

    @Override
    public double calculaSalario() {
        double salario = super.calculaSalario() + (addNoturno * noitesTrabalhadas);
        noitesTrabalhadas = 0;
        return salario;
    }
    public String show() {
        return super.show() + ", Categoria: Noturno";
    }
}
