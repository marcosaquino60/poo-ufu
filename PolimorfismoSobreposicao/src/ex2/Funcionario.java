package ex2;

public class Funcionario {
    protected int matricula;
    protected String nome;
    protected String cpf;
    protected int idade;
    protected double salarioBase;

    public Funcionario(int matricula, String nome, String cpf, int idade, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }
    public double calculaSalario() {
        return salarioBase;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public String show() {
        return "Nome: " + nome + ", Salário: R$" + calculaSalario();
    }
}
