package ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Funcionario[] funcs = new Funcionario[2];
        Scanner scanner = new Scanner(System.in);
        int matricula, idade, vendas, noitesTrabalhadas;
        String nome, cpf;
        double salarioBase;
        System.out.println("Qual o salário base dos funcionarios?: ");
        salarioBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\n====== Criando Vetor de Funcionários ======\n");
        for(int i = 0; i < funcs.length; i++) {
            int opcao = 0;
            do {
                System.out.println("1 - Funcionário Comissionado\n2 - Funcionário Noturno");
                opcao = scanner.nextInt();
            }while(opcao != 1 && opcao != 2);
            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrando Funcionário Comissionado . . .\n");
                    System.out.print("Matricula: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    funcs[i] = new FuncionarioComissionado(matricula,nome,cpf,idade,salarioBase);
                    System.out.println("Digite o numero de vendas: ");
                    vendas = scanner.nextInt();
                    scanner.nextLine();
                    ((FuncionarioComissionado)funcs[i]).computaVendas(vendas);
                    break;

                case 2:
                    System.out.println("\nCadastrando Funcionário Noturno . . .\n");
                    System.out.print("Matricula: ");
                    matricula = scanner.nextInt();
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    funcs[i] = new FuncionarioNoturno(matricula,nome,cpf,idade,salarioBase);
                    System.out.println("Digite o numero de vendas: ");
                    noitesTrabalhadas = scanner.nextInt();
                    scanner.nextLine();
                    ((FuncionarioNoturno)funcs[i]).computaNoites(noitesTrabalhadas);
                    break;

            }
        }
        int opcao;
        do {
            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1 - Pesquisar funcionário por CPF ou matrícula");
            System.out.println("2 - Mostrar quantidade de funcionários por categoria");
            System.out.println("3 - Mostrar maior salário de cada categoria");
            System.out.println("4 - Montar folha de pagamentos");
            System.out.println("0 - Sair");
            System.out.println("Digite o número correspondente à opção desejada:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\nPesquisar Funcionário . . .\n");
                    System.out.print("Digite o CPF ou matrícula do funcionário: ");
                    String cpfOuMatricula = scanner.nextLine();
                    boolean encontrado = false;
                    for (Funcionario func : funcs) {
                        if (func != null && (func.getCpf().equals(cpfOuMatricula) || String.valueOf(func.getMatricula()).equals(cpfOuMatricula))) {
                            System.out.println(func.show());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("\nQuantidade de Funcionários por Categoria . . .\n");
                    int qtdFuncComissionado = 0;
                    int qtdFuncNoturno = 0;
                    for (Funcionario func : funcs) {
                        if (func instanceof FuncionarioComissionado) {
                            qtdFuncComissionado++;
                        } else if (func instanceof FuncionarioNoturno) {
                            qtdFuncNoturno++;
                        }
                    }
                    System.out.println("Quantidade de Funcionários Comissionados: " + qtdFuncComissionado);
                    System.out.println("Quantidade de Funcionários Noturnos: " + qtdFuncNoturno);
                    break;
                case 3:
                    System.out.println("\nMaior Salário por Categoria . . .\n");
                    double maiorSalarioComissionado = 0;
                    double maiorSalarioNoturno = 0;
                    for (Funcionario func : funcs) {
                        if (func instanceof FuncionarioComissionado) {
                            if (func.calculaSalario() > maiorSalarioComissionado) {
                                maiorSalarioComissionado = func.calculaSalario();
                            }
                        } else if (func instanceof FuncionarioNoturno) {
                            if (func.calculaSalario() > maiorSalarioNoturno) {
                                maiorSalarioNoturno = func.calculaSalario();
                            }
                        }
                    }
                    System.out.println("Maior Salário de Funcionários Comissionados: R$" + maiorSalarioComissionado);
                    System.out.println("Maior Salário de Funcionários Noturnos: R$" + maiorSalarioNoturno);
                    break;
                case 4:
                    System.out.println("\nMontando Folha de Pagamentos . . .\n");
                    double totalFolhaPagamentos = 0;
                    for (Funcionario func : funcs) {
                        if (func != null) {
                            System.out.println(func.show());
                            totalFolhaPagamentos += func.calculaSalario();
                        }
                    }
                    System.out.println("Total da Folha de Pagamentos: R$" + totalFolhaPagamentos);
                    break;
                case 0:
                    System.out.println("\nSaindo do Programa. . .\n");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }
}


