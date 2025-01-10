package com.example;


import java.util.ArrayList;

import com.example.Modelo.Producao;
import com.example.Modelo.ResumoProducao;


public class Main {
    public static void main(String[] args) {

        ArrayList<Producao> producao = LeitorArquivoJson.lerArquivoProducao();
        CalculadoraIterador calculadoraIterador = new CalculadoraIterador();
        ResumoProducao resumo = calculadoraIterador.processarProducao(producao);

        String valorImpostoFormatado = FormatadorNumerico.formatar(resumo.getValorTotalImposto());
        String valorProducaoFormatado = FormatadorNumerico.formatar(resumo.getValorTotalProducao());

        System.out.println("Valor total de imposto: " + valorImpostoFormatado);
        System.out.println("Valor total de produção: " + valorProducaoFormatado);

    }

   

}
