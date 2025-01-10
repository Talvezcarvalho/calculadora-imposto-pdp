package com.example;

import java.math.BigDecimal;

import com.example.Calculadora.Calculadora;
import com.example.Modelo.Producao;
import com.example.Modelo.ResumoProducao;

public class CalculadoraResumoProducao {
    private final Calculadora calculadora;
    BigDecimal valorTotalProducao = BigDecimal.ZERO;
    BigDecimal valorTotalImposto = BigDecimal.ZERO;

    public CalculadoraResumoProducao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public ResumoProducao calcularResumo(Producao producao) {
        BigDecimal valorTotal = calculadora.calcularValorTotal(producao);
        BigDecimal valorImposto = calculadora.calcularImposto(producao);
        return new ResumoProducao(valorTotal, valorImposto);
    }
}
