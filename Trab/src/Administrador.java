import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administrador extends Usuario {

    public Administrador(String nome, String username, String password) {
        super(nome, username, password);
    }
    public void criarPergunta() {
        String[] opcoes = new String[4];
        String enunciado;
        int dificuldade, respostaCorreta = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o enunciado da pergunta: ");
        enunciado = scanner.nextLine();
        System.out.println("Respostas: ");
        for(int i = 0; i < 4; i++) {
            System.out.print("Digite a opção " + (i+1)+ ":");
            opcoes[i] = scanner.nextLine();

        }
        do {
            System.out.print("Qual a resposta correta? (1|2|3|4)");
            respostaCorreta = scanner.nextInt();
            scanner.nextLine(); //Limpando buffer
        }while(respostaCorreta < 1 || respostaCorreta > 4);

        do {
            System.out.print("Qual a dificuldade? (1|2|3)");
            dificuldade = scanner.nextInt();
            scanner.nextLine(); //Limpando buffer
        }while(dificuldade < 1 || dificuldade > 3);


        FileWriter writeFile = null;
        JSONObject objectJson = new JSONObject();
        JSONArray arrayJson = new JSONArray();
        objectJson.put("enunciado", enunciado);
        objectJson.put("respostaCorreta", respostaCorreta);
        objectJson.put("dificuldade", dificuldade);
        for (String opcao : opcoes) {
            arrayJson.add(opcao);
        }
        objectJson.put("opcoes", arrayJson);
        System.out.println(objectJson.toJSONString());
        try {
            boolean fileExists = new File("dados.json").exists();
            writeFile = new FileWriter("dados.json", true);
            if(fileExists) {
                writeFile.write(",\n"); //adiciona uma virgula e uma quebra de linha no arquivo(para separar os objetos) caso já tneha algo escrito nele
            }
            else {

            }
            writeFile.write(objectJson.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void puxaPergunta() {
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();
        Pergunta pergunta = new Pergunta();

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("dados.json"));

            pergunta.setEnunciado((String) jsonObject.get("enunciado"));
            JSONArray opcoesJSON = (JSONArray) jsonObject.get("opcoes");
            if (opcoesJSON != null) {

                String[] opcoes = new String[opcoesJSON.size()];
                for (int i = 0; i < opcoesJSON.size(); i++) {
                    opcoes[i] = (String) opcoesJSON.get(i);
                }
                pergunta.setOpcoes(opcoes);
            }
            pergunta.setRespostaCorreta(((Long) jsonObject.get("respostaCorreta")).intValue());
            pergunta.setDificuldade(((Long) jsonObject.get("dificuldade")).intValue());

            System.out.println("PERGUNTA: " + pergunta.toString());

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }catch(ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
