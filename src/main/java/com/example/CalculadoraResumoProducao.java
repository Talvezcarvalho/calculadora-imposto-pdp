package com.example;

import java.math.BigDecimal;
import java.util.List;

import com.example.Modelo.Producao;
import com.example.Modelo.ResumoProducao;

public class CalculadoraResumoProducao {
    private final Calculadora calculadora;

    public CalculadoraResumoProducao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    

    public ResumoProducao calcularResumo(List<Producao> listaProducao) {
        BigDecimal valorTotalProducao = BigDecimal.ZERO;
        BigDecimal valorTotalImposto = BigDecimal.ZERO;

        for (Producao producao : listaProducao) {
            valorTotalImposto = valorTotalImposto.add(calculadora.calcularImposto(producao));
            valorTotalProducao = valorTotalProducao.add(calculadora.calcularValorTotal(producao));
        }
        return new ResumoProducao(valorTotalProducao, valorTotalImposto);
    }
}
