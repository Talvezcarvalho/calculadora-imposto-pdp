package com.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import com.example.Modelo.Producao;
import com.example.Modelo.UnidadeFederacao;

public class Calculadora {
    public BigDecimal calcularImposto(Producao producao) {

        if (producao.getlocalProducao() == null) {
            throw new IllegalArgumentException("Estado inválido!");
        }

            UnidadeFederacao localProducao = producao.getlocalProducao();
            BigDecimal divisor  = switch (localProducao) {
            case AMAZONAS -> new BigDecimal("9.99");
            case ALAGOAS -> new BigDecimal("10.10");
            case ACRE -> new BigDecimal("11.11");
            case AMAPA -> new BigDecimal("12.12");
            case BAHIA -> new BigDecimal("13.13");
            case PARA -> new BigDecimal("14.14");
            case MATO_GROSSO -> new BigDecimal("15.15");
            case MINAS_GERAIS -> new BigDecimal("16.16");
            case MATO_GROSSO_DO_SUL -> new BigDecimal("17.17");
            case GOIAS -> new BigDecimal("18.18");
            case MARANHAO -> new BigDecimal("19.19");
            case RIO_GRANDE_DO_SUL -> new BigDecimal("20.20");
            case TOCANTINS -> new BigDecimal("21.21");
            case PIAUI -> new BigDecimal("22.22");
            case SAO_PAULO -> new BigDecimal("23.23");
            case RONDONIA -> new BigDecimal("24.24");
            case RORAIMA -> new BigDecimal("25.25");
            case PARANA -> new BigDecimal("26.26");
            case CEARA -> new BigDecimal("27.27");
            case PERNAMBUCO -> new BigDecimal("28.28");
            case SANTA_CATARINA -> new BigDecimal("29.29");
            case PARAIBA -> new BigDecimal("30.30");
            case RIO_GRANDE_DO_NORTE -> new BigDecimal("31.31");
            case ESPIRITO_SANTO -> new BigDecimal("32.32");
            case RIO_DE_JANEIRO -> new BigDecimal("33.33");
            case SERGIPE -> new BigDecimal("34.34");
            case DISTRITO_FEDERAL -> new BigDecimal("35.35");
            default -> throw new IllegalArgumentException("Estado inválido!");
            };

            BigDecimal valorTotal = producao.getValorUnitario().multiply(new BigDecimal(producao.getQuantidade()));

            BigDecimal valorImposto = valorTotal.divide(divisor, MathContext.DECIMAL128);

            return valorImposto.setScale(2, RoundingMode.UP
            );
        }

    public BigDecimal calcularValorTotal(Producao producao) {
        BigDecimal valorTotal = producao.getValorUnitario().multiply(new BigDecimal(producao.getQuantidade()));
        return valorTotal;
    }
}