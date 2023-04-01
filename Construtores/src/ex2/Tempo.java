package ex2;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        if(hora < 0 || hora > 23) {
            this.hora = 0;
        }
        if(minuto < 0 || minuto > 59) {
            minuto = 0;
        }
        if(segundo < 0 || segundo > 59) {
            segundo = 0;
        }
    }
    //Métodos de ajuste para os minutos
    public void incrementaMinuto() {
        minuto ++;
        if(minuto > 59) {
            minuto = 0;
            hora ++;
        }
    }
    public void decrementaMinuto() {
        minuto --;
        if(minuto < 0) {
            minuto = 59;
            hora --;
        }
    }
    public void mostrarTempo() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
    public void mostrarTempoFormatado() {
        String meridiem = (hora > 12) ? "PM" : "AM";
        int horaFormatada = (hora == 0 || hora == 12) ? 12 : hora % 12;
        System.out.printf("%02d:%02d:%02d:%s\n", horaFormatada, minuto, segundo, meridiem);
    }
}
