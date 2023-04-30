package ex1;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private static Forma[] formas = new Forma[10];
    private static int counter;
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Cadastrar uma forma");
            System.out.println("2. Mostrar descrição textual de todas as formas cadastradas");
            System.out.println("3. Mostrar área das formas bidimensionais cadastradas");
            System.out.println("4. Mostrar volume das formas tridimensionais cadastradas");
            System.out.println("5. Verificar se existem duas esferas ou dois círculos que se interceptam");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do Scanner

            switch (opcao) {
                case 1:
                    cadastrarForma();
                    break;
                case 2:
                    mostrarDescricaoFormas();
                    break;
                case 3:
                    mostrarAreaFormasBidimensionais();
                    break;
                case 4:
                    mostrarVolumeFormasTridimensionais();
                    break;
                case 5:
                    verificarInterseccaoFormas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

    }
    private void cadastrarForma() {
        System.out.println("----- Cadastrar Forma -----");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Triângulo");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Tetraedro");
        System.out.print("Escolha uma forma para cadastrar: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do Scanner

        String identificador, cor;
        double x, y, z, raio, lado, base, alturaBase, altura;

        switch (escolha) {
            case 1:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do centro: ");
                x = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Coordenada Y do centro: ");
                y = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Raio: ");
                raio = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Circulo(identificador, cor, x, y, raio);
                break;
            case 2:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do centro: ");
                x = scanner.nextDouble();
                System.out.print("Coordenada Y do centro: ");
                y = scanner.nextDouble();
                System.out.print("Lado: ");
                lado = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Quadrado(identificador, cor, x, y, lado);
                break;
            case 3:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do centro: ");
                x = scanner.nextDouble();
                System.out.print("Coordenada Y do centro: ");
                y = scanner.nextDouble();
                System.out.print("Base: ");
                base = scanner.nextDouble();
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Triangulo(identificador, cor, x, y, base, altura);
                break;
            case 4:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do centro: ");
                x = scanner.nextDouble();
                System.out.print("Coordenada Y do centro: ");
                y = scanner.nextDouble();
                System.out.print("Coordenada Z do centro: ");
                z = scanner.nextDouble();
                System.out.print("Raio: ");
                raio = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Esfera(identificador, cor, x, y, z, raio);
                break;
            case 5:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do canto inferior esquerdo: ");
                x = scanner.nextDouble();
                System.out.print("Coordenada Y do canto inferior esquerdo: ");
                y = scanner.nextDouble();
                System.out.print("Coordenada Z do canto inferior esquerdo: ");
                z = scanner.nextDouble();
                System.out.print("Lado: ");
                lado = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Cubo(identificador, cor, x, y, z, lado);
                break;
            case 6:
                System.out.print("Identificador: ");
                identificador = scanner.nextLine();
                System.out.print("Cor: ");
                cor = scanner.nextLine();
                System.out.print("Coordenada X do centro: ");
                x = scanner.nextDouble();
                System.out.print("Coordenada Y do centro: ");
                y = scanner.nextDouble();
                System.out.print("Coordenada Z do centro: ");
                z = scanner.nextDouble();
                System.out.print("Base: ");
                base = scanner.nextDouble();
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                System.out.print("Altura da base: ");
                alturaBase = scanner.nextDouble();
                scanner.nextLine();
                formas[counter++] = new Tetraedro(identificador, cor, x, y, z, base, altura, alturaBase);
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }
    public void mostrarDescricaoFormas() {
        if (counter == 0) {
            System.out.println("Nenhuma forma cadastrada.");
        } else {
            System.out.println("Descrição textual de todas as formas cadastradas:");
            for (int i = 0; i < counter; i++) {
                formas[i].mostrarDescricao();
            }
        }
    }
    public void mostrarAreaFormasBidimensionais() {
        boolean encontrou = false;
        for (int i = 0; i < counter; i++) {
            if (formas[i] instanceof FormaBidimensional) {
                encontrou = true;
                System.out.println("Identificador: " + formas[i].identificador);
                System.out.println("Área: " + ((FormaBidimensional) formas[i]).obterArea());
                System.out.println("---------------------------");
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma forma bidimensional cadastrada.");
        }
    }
    public void mostrarVolumeFormasTridimensionais() {
        boolean encontrou = false;
        for (int i = 0; i < counter; i++) {
            if (formas[i] instanceof FormaTridimensional) {
                encontrou = true;
                System.out.println("Identificador: " + formas[i].identificador);
                System.out.println("Volume: " + ((FormaTridimensional) formas[i]).obterVolume());
                System.out.println("---------------------------");
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma forma tridimensional cadastrada.");
        }
    }
    public void verificarInterseccaoFormas() {
        ArrayList<Circulo> circulos = new ArrayList<>();
        ArrayList<Esfera> esferas = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            if (formas[i] instanceof Circulo) {
                circulos.add((Circulo) formas[i]);
            } else if (formas[i] instanceof Esfera) {
                esferas.add((Esfera) formas[i]);
            }
        }

        boolean encontrouInterseccao = false;

        for (int i = 0; i < circulos.size(); i++) {
            for (int j = i + 1; j < circulos.size(); j++) {
                if (circulos.get(i).seIntercepta(circulos.get(j))) {
                    encontrouInterseccao = true;
                    System.out.println("Círculo " + circulos.get(i).getIdentificador() + " intercepta Círculo " +
                            circulos.get(j).getIdentificador());
                }
            }
        }
        for (int i = 0; i < esferas.size(); i++) {
            for (int j = i + 1; j < esferas.size(); j++) {
                if (esferas.get(i).seIntercepta(esferas.get(j))) {
                    encontrouInterseccao = true;
                    System.out.println("Esfera " + esferas.get(i).getIdentificador() + " intercepta Esfera " +
                            esferas.get(j).getIdentificador());
                }
            }
        }

        if (!encontrouInterseccao) {
            System.out.println("Nenhuma interseção encontrada.");
        }
    }

}
