package com.example.Calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.example.Modelo.Producao;

public class CalculadoraParana implements Calculadora {

	@Override
    public BigDecimal calcularImposto(Producao producao) {
        BigDecimal divisor = new BigDecimal("26.26");
        BigDecimal valorTotal = producao.getValorUnitario()
                .multiply(new BigDecimal(producao.getQuantidade()));
        return valorTotal.divide(divisor, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularValorTotal(Producao producao) {
        return producao.getValorUnitario().multiply(new BigDecimal(producao.getQuantidade()));
    }

}
