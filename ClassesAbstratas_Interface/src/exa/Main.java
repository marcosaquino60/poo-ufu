package exa;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Gerente("Marcos", "123", 5000.0);
        funcionarios[1] = new Assistente("Aquino", "456", 2500.0);
        funcionarios[2] = new Vendedor("Nunes", "789", 2000.0, 1000.0);
        funcionarios[3] = new Vendedor("Silva", "987", 2000.0, 1500.0);
        funcionarios[4] = new Assistente("Souza", "654", 3000.0);

        double total = 0.0;
        double mediaGerente = 0.0;
        double mediaAssistente = 0.0;
        double mediaVendedor = 0.0;
        int numGerente = 0;
        int numAssistente = 0;
        int numVendedor = 0;

        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calculaSalario();

            if (funcionario instanceof Gerente) {
                mediaGerente += funcionario.calculaSalario();
                numGerente++;
            } else if (funcionario instanceof Assistente) {
                mediaAssistente += funcionario.calculaSalario();
                numAssistente++;
            } else if (funcionario instanceof Vendedor) {
                mediaVendedor += funcionario.calculaSalario();
                numVendedor++;
            }
        }

        System.out.printf("Total da folha salarial: R$ %.2f%n", total);

        if (numGerente > 0) {
            mediaGerente /= numGerente;
            System.out.printf("Média salarial dos gerentes: R$ %.2f%n", mediaGerente);
        }

        if (numAssistente > 0) {
            mediaAssistente /= numAssistente;
            System.out.printf("Média salarial dos assistentes: R$ %.2f%n", mediaAssistente);
        }

        if (numVendedor > 0) {
            mediaVendedor /= numVendedor;
            System.out.printf("Média salarial dos vendedores: R$ %.2f%n", mediaVendedor);
        }
    }
}

