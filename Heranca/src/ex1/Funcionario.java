package ex1;

public class Funcionario {
    private String nome;
    private String rg;
    private double salario;

    public Funcionario(String nome, String rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }
}
