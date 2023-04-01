package Exc;

import java.util.Scanner;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    public String tipoTriangulo() {
        if(lado1 == lado2 && lado2 == lado3 ) {
            return "Equilatero";
        }
        else if(lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
            return "Escaleno";
        }
        else return "Isosceles";
    }
    private static int max = 10;
    private static Triangulo[] triangulos = new Triangulo[max];
    private static int numTriangulos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Inserir triângulo: ");
            System.out.println("2 - Mostrar triângulos: ");
            System.out.println("3 - Mostrar número de triângulos equiláteros");
            System.out.println("4 - Mostrar o triângulo com o maior perímetro");
            System.out.println("0 - Sair");

            System.out.print("Digite sua opção: ");
            choice = scanner.nextInt();
            System.out.println();

            switch(choice) {
                case 1:
                    inserirTriangulo(scanner);
                    break;
                case 2:
                    mostrarTriangulos();
                    break;
                case 3:
                    numEquilateros();
                    break;
                case 4:
                    maiorPerimetro();
                    break;
                case 0:
                    System.out.println("Saindo . . .");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        } while(choice != 0);
    }
    private static void inserirTriangulo(Scanner scanner) {
        if (numTriangulos < max) {
            System.out.print("Digite o lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Digite o lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Digite o lado 3: ");
            double lado3 = scanner.nextDouble();

            triangulos[numTriangulos] = new Triangulo(lado1, lado2, lado3);
            numTriangulos++;

        } else System.out.println("Não é possível cadastrar mais triângulos.");
    }
    private static void mostrarTriangulos() {
        if (numTriangulos > 0) {
            for (int i = 0; i < numTriangulos; i++) {
                System.out.println("Triângulo " + i +" Lado 1 = " + triangulos[i].getLado1() + " Lado 2 = " + triangulos[i].getLado2() +
                        " Lado 3 = " + triangulos[i].getLado3() + " Tipo = " + triangulos[i].tipoTriangulo());
            }
        }
        else System.out.println("Não há triângulos cadastrados");
    }
    private static void numEquilateros() {
        int qntequilateros = 0;
        for(int i = 0; i < numTriangulos; i++) {
            if(triangulos[i].tipoTriangulo().equals("Equilatero")) {
                qntequilateros ++;
            }
        }
        System.out.println("O número de equilateros é " + qntequilateros);
    }
    private static void maiorPerimetro() {
        int indMaior = 0; double periMaior = 0;
        for (int i = 0; i < numTriangulos; i++) {
            if(i == 0) {
                periMaior = triangulos[i].perimetro();
                indMaior = i;
            }
            else if(triangulos[i].perimetro() > periMaior) {
                periMaior = triangulos[i].perimetro();
                indMaior = i;
            }

        }
        System.out.println("O maior perimetro encontrado foi do Exd.Triangulo " + indMaior + " com " + periMaior + " de perímetro.");
    }

}


