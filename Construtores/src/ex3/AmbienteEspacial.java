package ex3;

import java.util.Scanner;
public class AmbienteEspacial {
    private static int MAX = 5;
    private int countNaves;
    private NaveEspacial[] naves;
    Scanner scanner = new Scanner(System.in);

    public AmbienteEspacial() {
        naves = new NaveEspacial[MAX];
        countNaves = 0;
    }
    public void menu() {
        int opcao = -1;
        while(true) {
            System.out.println("\n======== MENU ========");
            System.out.println("1 - Criar nave:");
            System.out.println("2 - Mostrar as Naves:");
            System.out.println("3 - Parar nave:");
            System.out.println("4 - Ligar nave:");
            System.out.println("5 - Mostrar nave mais rápida:");
            System.out.println("0 - Sair:");

            System.out.println("Escolha sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarNave();
                    break;
                case 2:
                    mostrarNaves();
                    break;
                case 3:
                    pararNave();
                    break;
                case 4:
                    ligarNave();
                    break;
                case 5:
                    compararNaves();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida . . . ");
                    break;
            }

        }
    }
    private void criarNave() {
        if(countNaves < MAX) {
            System.out.println("Digite o nome da nave: ");
            String nome = scanner.next();
            NaveEspacial nave = new NaveEspacial(nome);
            naves[countNaves] = nave;
            countNaves++;
        }
        else {
            System.out.println("Desculpe, número máximo de criação de naves atingido!");
        }
    }
    private void mostrarNaves() {
        if(countNaves == 0) {
            System.out.println("Nenhuma nave foi criada");
        }
        else {
            System.out.println("==== Naves Existentes ====");
            for (int i = 0; i < countNaves; i++) {
                naves[i].mostrarNave();
            }
        }
    }
    private void pararNave() {
        for(int i = 0; i < countNaves; i++) {
            if(naves[i].velocidade == 0) {
                continue;
            }
            naves[i].mostrarNave();
            System.out.println("Deseja parar esta nave? (s/n):");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("s")){
                naves[i].velocidade = 0;
                System.out.println("Nave parada com sucesso!");
            }

        }
    }
    private int contarNavesEmMovimento() {
        int count = 0;
        for(int i = 0; i < countNaves; i++) {
            if(naves[i].velocidade != 0) {
                count++;
            }
        }
        return count;
    }
    private void ligarNave() {
        if(contarNavesEmMovimento() <= 3) {
            for(int i = 0; i < countNaves; i++) {
                if(naves[i].velocidade != 0) {
                    continue;
                }
                naves[i].mostrarNave();
                System.out.println("Deseja ligar esta nave? (s/n): ");
                String resposta = scanner.nextLine();
                if(resposta.equalsIgnoreCase("s")){
                    int valor;
                    do {
                        System.out.println("Digite um valor de velocidade no intervalo de 5 a 10");
                        valor = scanner.nextInt();
                    }while(valor < 5 || valor > 10);
                    naves[i].velocidade = valor;
                    System.out.println("Velocidade alterada para " + valor + " com sucesso!");
                }
            }
        }
        else {
            System.out.println("Superpopulação de naves.");
        }
    }



    private void compararNaves() {
        if(countNaves == 0) {
            System.out.println("Nenhuma nave foi criada");
        }
        else if(countNaves < 2) {
            System.out.println("Quantidade de naves insuficiente para haver comparações.");
        }
        else {
            System.out.println("Escreva o nome de uma nave: ");
            String nomeNave1 = scanner.next();
            NaveEspacial naveComp1 = null;
            for(int i = 0; i < countNaves; i++) {
                if(naves[i].nome.equals(nomeNave1)) {
                    naveComp1 = naves[i];
                    break;
                }
            }
            if(naveComp1 == null) {
                System.out.println("Nave não encontrada");
            }
            else {
                NaveEspacial naveComp2 = null;
                do {
                    System.out.println("Escreva o nome da segunda nave que você deseja comparar: ");
                    String nomeNave2 = scanner.next();
                    for(int i = 0; i < countNaves; i++) {
                        if(naves[i].nome.equals(nomeNave2)) {
                            naveComp2 = naves[i];
                        }
                    }
                    if(naveComp2 == null) {
                        System.out.println("Nave não encontrada, tente novamente: ");
                    }
                }while(naveComp2 == null);

                if(naveComp1.naveMaisRapida(naveComp2)) {
                    System.out.println("A nave " + naveComp1.nome + " é a mais rápida!");
                }
                else {
                    System.out.println("A nave " + naveComp1.nome + " não é mais rápida que a nave " + naveComp2.nome + "!");
                }
            }

        }


    }
}
