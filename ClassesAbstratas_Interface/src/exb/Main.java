package exb;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[5];
        veiculos[0] = new Carro("Fiat", "Uno", "vermelho", 100);
        veiculos[1] = new Moto("Honda", "CG", "azul", 150);
        veiculos[2] = new Carro("Ford", "Fiesta", "vermelho", 101);
        veiculos[3] = new Moto("Yamaha", "YBR", "preta", 60);
        veiculos[4] = new Carro("Chevrolet", "Cruze", "vermelho", 200);

        double maiorPotencia = 0;
        String marcaMaiorPotencia = "";
        String marcaMenorPotencia = "";
        double menorPotencia = Double.MAX_VALUE;

        for (int i = 0; i < veiculos.length; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.cor().equals("vermelho")) {
                double potencia = veiculo.potencia();
                String marca = veiculo.marca();
                System.out.println("Veículo vermelho: " + marca + " - Potência: " + potencia);
                if (potencia > maiorPotencia) {
                    maiorPotencia = potencia;
                    marcaMaiorPotencia = marca;
                }
                if (potencia < menorPotencia) {
                    menorPotencia = potencia;
                    marcaMenorPotencia = marca;
                }
            }
        }

        System.out.println("Marca do carro mais potente: " + marcaMaiorPotencia);
        System.out.println("Marca do carro menos potente: " + marcaMenorPotencia);
    }
}
