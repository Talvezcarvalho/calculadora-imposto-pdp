package com.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.example.Calculadora.Calculadora;
import com.example.Modelo.Producao;
import com.example.Modelo.ResumoProducao;
import com.example.Modelo.UnidadeFederacao;

public class CalculadoraIterador {
    private final Map<UnidadeFederacao, Calculadora> calculadoras;

    public CalculadoraIterador() {
        this.calculadoras = CalculadoraFabrica.getCalculadoras();
    }

    public ResumoProducao processarProducao(List<Producao> producoes) {
        ResumoProducao resumoTotal = new ResumoProducao(BigDecimal.ZERO, BigDecimal.ZERO);
        for (Producao producao : producoes) {
            if (producao.getlocalProducao() == null) {
                throw new IllegalArgumentException("Estado inválido!");
            }
            Calculadora calculadora = calculadoras.get(producao.getlocalProducao());

            ResumoProducao resumoProducao = new ResumoProducao(calculadora.calcularValorTotal(producao),
                    calculadora.calcularImposto(producao));
            resumoTotal.add(resumoProducao);
        }
        return resumoTotal;
    }
}
