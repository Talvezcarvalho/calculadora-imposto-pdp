package com.example.Modelo;

import java.math.BigDecimal;

public class ResumoProducao {
    private BigDecimal valorTotalProducao;
    private BigDecimal valorTotalImposto;

    public ResumoProducao(BigDecimal valorTotalProducao, BigDecimal valorTotalImposto) {
        super();
        this.valorTotalProducao = valorTotalProducao;
        this.valorTotalImposto = valorTotalImposto;
    }

    public BigDecimal getValorTotalProducao() {
        return valorTotalProducao;
    }

    public void setValorTotalProducao(BigDecimal valorTotalProducao) {
        this.valorTotalProducao = valorTotalProducao;
    }

    public BigDecimal getValorTotalImposto() {
        return valorTotalImposto;
    }

    public void setValorTotalImposto(BigDecimal valorTotalImposto) {
        this.valorTotalImposto = valorTotalImposto;
    }

}
