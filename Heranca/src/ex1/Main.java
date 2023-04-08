package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedor[] vendedores = new Vendedor[5];
        Administrativo[] administrativos = new Administrativo[5];

        //laço pra preencher o vetor de vendedores
        for(int i = 0; i < 5; i++) {
            System.out.println("Vendedor " + (i+1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o RG: ");
            String rg = scanner.nextLine();
            System.out.print("Digite o salário base: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            vendedores[i] = new Vendedor(nome, rg, salario);
            System.out.print("Digite as vendas do mes: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            vendedores[i].adicionarVenda(valor);
        }
        //laço para preencher o vetor dos administrativos
        for(int i = 0; i < 5; i++) {
            System.out.println("Administrativo " + (i+1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o RG: ");
            String rg = scanner.nextLine();
            System.out.print("Digite o salário base: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            administrativos[i] = new Administrativo(nome,rg,salario);
            System.out.print("Digite as horas extras trabalhadas do mes: ");
            double horas = scanner.nextDouble();
            scanner.nextLine();
            administrativos[i].adicionarHoras(horas);
        }

        //laço para mostrar os vendedores e seus metodos
        System.out.println("\n=======VENDEDORES=======\n");
        for(int i = 0; i < 5; i++) {
            System.out.println("Vendedor " + (i+1));
            System.out.println("Nome: " + vendedores[i].getNome());
            System.out.println("RG: " + vendedores[i].getRg());
            System.out.printf("Salario base: R$%.2f\n", vendedores[i].getSalario());
            System.out.printf("Total de vendas: R$%.2f\n", vendedores[i].getVendas());
            System.out.printf("Salario bruto: R$%.2f\n", vendedores[i].calculaSalario());
        }

        //laço para mostrar os administrativos e seus metodos
        System.out.println("\n=======Administrativos=======\n");
        for(int i = 0; i < 5; i++) {
            System.out.println("Administrativo " + (i+1));
            System.out.println("Nome: " + administrativos[i].getNome());
            System.out.println("RG: " + administrativos[i].getRg());
            System.out.printf("Salario base: R$%.2f\n", administrativos[i].getSalario());
            System.out.printf("Total de horas extra trabalhadas: %.2f horas.\n", administrativos[i].getHoras());
            System.out.printf("Salario bruto: R$%.2f\n", administrativos[i].calculaSalario());
        }
    }
}
