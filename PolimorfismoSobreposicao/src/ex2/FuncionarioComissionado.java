package ex2;

public class FuncionarioComissionado extends Funcionario{
    private int vendas;
    private double comissao;
    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade, double salarioBase) {
        super(matricula, nome, cpf, idade, salarioBase);
        this.comissao = 0.05;
        this.vendas = 0;
    }
    public void computaVendas(int vendas) {
        this.vendas += vendas;
    }
    public double calculaSalario() {
        double salario = super.calculaSalario() + (vendas * comissao);
        vendas = 0;
        return  salario;
    }
    public String show() {
        return super.show() + ", Categoria: Comissionado";
    }
}
