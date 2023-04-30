import java.util.Arrays;

public class Pergunta {
    private String[] opcoes = new String[4];
    private String enunciado;
    private int respostaCorreta;
    private int dificuldade;

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    public String toString() {
        int i = 0;
        return "Enunciado: " + enunciado + "\nOpções: " + Arrays.toString(opcoes) + "\nResposta Correta: " + respostaCorreta + "\nDificuldade: " + dificuldade;
    }
}
