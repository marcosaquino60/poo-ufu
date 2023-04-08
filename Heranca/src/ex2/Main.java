package ex2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Dvd[] dvds = new Dvd[5];
        Cd[] cds = new Cd[5];
        Vhs[] vhss = new Vhs[5];

        criaCDS(cds);
        criaDVDS(dvds);
        criarVHSs(vhss);

        exibeCDS(cds);
        exibeDVDS(dvds);
        exibeVHSs(vhss);
    }

    private static void criaCDS(Cd[] cds) {
        Scanner scanner = new Scanner(System.in);
        //laço para preencher o vetor de cds
        for (int i = 0; i < 5; i++) {
            String tipo = "audio";
            System.out.println("Ler CD " + (i + 1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o gênero: ");
            String genero = scanner.nextLine();
            System.out.print("Digite o preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite o nome do cantor: ");
            String cantor = scanner.nextLine();
            System.out.print("Digite o número de faixas: ");
            int faixas = scanner.nextInt();
            scanner.nextLine();
            cds[i] = new Cd(nome, tipo, genero, preco, cantor, faixas);
        }
    }

    private static void criaDVDS(Dvd[] dvds) {
        Scanner scanner = new Scanner(System.in);
        //laço para preencher vetor de DVDS
        for (int i = 0; i < 5; i++) {
            ArrayList<String> atores = new ArrayList<String>();
            String tipo = "video";
            System.out.println("Ler DVD " + (i + 1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o genero: ");
            String genero = scanner.nextLine();
            System.out.print("Digite o preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o nome dos atores (digite fim quando acabar): ");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("fim")) {
                    break;
                }
                atores.add(input);
            }
            System.out.print("Digite o nome do diretor: ");
            String diretor = scanner.nextLine();
            System.out.print("Digite o tempo de duração: ");
            int duracao = scanner.nextInt();
            scanner.nextLine();
            dvds[i] = new Dvd(nome, tipo, genero, preco, atores, diretor, duracao);
        }
    }

        private static void criarVHSs(Vhs[] vhss) {
            Scanner scanner = new Scanner(System.in);
            //laço para preencher vetor de DVDS
            for (int i = 0; i < 5; i++) {
                String tipo = "video";
                boolean rebobinada;
                System.out.println("Ler VHS" + (i + 1));
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o genero: ");
                String genero = scanner.nextLine();
                System.out.print("Digite o preço: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Está rebobinada? (Digite 's' para sim)");
                String input = scanner.nextLine();
                if(input.equalsIgnoreCase("s")) {
                    rebobinada = true;
                }
                else {
                    rebobinada = false;
                }
                vhss[i] = new Vhs(nome,tipo,genero,preco,rebobinada);
            }
        }
        private static void exibeCDS (Cd[]cds){
            System.out.println("=========CDS========");
            //laço para exibir os cds do vetor
            for (int i = 0; i < 5; i++) {
                System.out.println("CD " + (i + 1));
                cds[i].showInfo();
            }
        }
        private static void exibeDVDS (Dvd[]dvds){
            System.out.println("=========DVDS========");
            //laço para exibir informações do vetor de dvds
            for (int i = 0; i < 5; i++) {
                System.out.println("DVD " + (i + 1));
                dvds[i].showInfo();
            }
        }
        private static void exibeVHSs(Vhs[] vhss) {
            System.out.println("=========VHSs========");
            //laço para exibir informações do vetor de dvds
            for (int i = 0; i < 5; i++) {
                System.out.println("VHS " + (i + 1));
                vhss[i].showInfo();
            }
        }
}
