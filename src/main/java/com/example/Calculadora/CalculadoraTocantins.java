package com.example.Calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.example.Modelo.Producao;


public class CalculadoraTocantins implements Calculadora {

	@Override
    public BigDecimal calcularImposto(Producao producao) {
        BigDecimal divisor = new BigDecimal("21.21");
        BigDecimal valorTotal = producao.getValorUnitario()
                .multiply(new BigDecimal(producao.getQuantidade()));
        return valorTotal.divide(divisor, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularValorTotal(Producao producao) {
        return producao.getValorUnitario().multiply(new BigDecimal(producao.getQuantidade()));
    }

}