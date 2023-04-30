package exc;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Calcular quantidade e preço total por categoria");
            System.out.println("3 - Calcular preço total de todos os produtos");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Selecione o tipo de produto: ");
                System.out.println("1 - Eletrodoméstico");
                System.out.println("2 - Vinho");
                System.out.println("3 - Café");

                int tipo = scanner.nextInt();

                System.out.println("Digite o ID do produto: ");
                int id = scanner.nextInt();

                System.out.println("Digite o ano de produção do produto: ");
                int ano = scanner.nextInt();

                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();

                switch (tipo) {
                    case 1:
                        listaProdutos.add(new Eletrodomestico(id, ano, preco));
                        break;
                    case 2:
                        listaProdutos.add(new Vinho(id, ano, preco));
                        break;
                    case 3:
                        listaProdutos.add(new Cafe(id, ano, preco));
                        break;
                    default:
                        System.out.println("Tipo de produto inválido.");
                        break;
                }
            } else if (opcao == 2) {
                System.out.println("Digite a categoria desejada: ");
                String categoria = scanner.next();

                int quantidade = 0;
                double precoTotal = 0;

                for (Produto p : listaProdutos) {
                    if (p.getCategoria().equals(categoria)) {
                        quantidade++;
                        precoTotal += p.getPreco();
                    }
                }

                System.out.println("Quantidade de produtos da categoria " + categoria + ": " + quantidade);
                System.out.println("Preço total dos produtos da categoria " + categoria + ": " + precoTotal);
            } else if (opcao == 3) {
                double precoTotal = 0;

                for (Produto p : listaProdutos) {
                    precoTotal += p.getPreco();
                }

                System.out.println("Preço total de todos os produtos: " + precoTotal);
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
