package ex1;

public class Vendedor extends Funcionario {
    private double vendas;
    private double comissao;

    public Vendedor(String nome, String rg, double salario) {
        super(nome, rg, salario);
        this.vendas = 0;
        this.comissao = 0.05;
    }

    public void adicionarVenda(double valor) {
        vendas += valor;
    }

    public double getVendas() {
        return vendas;
    }

    public double calculaSalario() {
        double salario =  getSalario() + (getVendas() * comissao);
        vendas = 0;
        return salario;
    }
}
