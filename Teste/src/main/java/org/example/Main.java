package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(final String[] args) throws JsonProcessingException {
        final var json = "{\"nome\":\"Maria da Silva\"}";
        final var objectMapper = new ObjectMapper();
        final var pessoa = objectMapper.readValue(json, Pessoa.class);
        System.out.println(pessoa);
    }
}