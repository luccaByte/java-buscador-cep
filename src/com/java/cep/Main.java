package com.java.cep;

import com.google.gson.Gson;
import com.java.cep.models.Cep;
import com.java.cep.services.ViaCepClient;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ViaCepClient viaCep = new ViaCepClient();
        Gson gson = new Gson();

        System.out.println("Digite o cep: ");
        String input = sc.nextLine();

        try {
            String json = viaCep.buscaCep(input);
            Cep cep = gson.fromJson(json, Cep.class);

            System.out.println("Resultado da Busca:");
            System.out.println(cep);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar o CEP: " + e.getMessage());
        }

        sc.close();
    }
}
