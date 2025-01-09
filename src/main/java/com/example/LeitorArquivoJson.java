package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.example.Modelo.Producao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LeitorArquivoJson {
    
     public static ArrayList<Producao> lerArquivoProducao() {
        ArrayList<Producao> producao = new ArrayList<Producao>();
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("relatorioProducao.json")) {
            producao = gson.fromJson(reader, new TypeToken<ArrayList<Producao>>() {
            }.getType());
            return producao;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return producao;
    }
}
