package com.example.Calculadora;

import java.math.BigDecimal;

import com.example.Modelo.Producao;

public interface Calculadora {
    public BigDecimal calcularImposto(Producao producao);
    
    public BigDecimal calcularValorTotal(Producao producao);
}
