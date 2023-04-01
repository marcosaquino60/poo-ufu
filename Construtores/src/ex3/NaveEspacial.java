package ex3;
import java.util.Random;
public class NaveEspacial {
    String nome;
    int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public NaveEspacial(String s) {
        Random rand = new Random();
        int random = rand.nextInt(6); // gera um número inteiro aleatório de 0 a 5
        random += 5; // incrementa 5 nesse número pra ele entrar em um intervalo de 5 a 10
        nome = s;
        velocidade = random;
    }
    void mostrarNave() {
        System.out.println("Nave: " + nome + " Velocidade: " + velocidade);
        if(velocidade == 0) {
            System.out.println("Nave inoperante");
        }
    }
    public boolean  naveMaisRapida(NaveEspacial nave) {
        if(this.velocidade > nave.velocidade) {
            return true;
        }
        else {
            return false;
        }
    }
}
