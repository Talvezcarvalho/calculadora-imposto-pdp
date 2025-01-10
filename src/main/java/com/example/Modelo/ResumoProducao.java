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

    public void addValorTotalProducao(BigDecimal valorTotalProducao) {
        this.valorTotalProducao = this.valorTotalProducao.add(valorTotalProducao);
    }

    public void addValorTotalImposto(BigDecimal valorTotalImposto) {
        this.valorTotalImposto = this.valorTotalImposto.add(valorTotalImposto);
    }

    public void add(ResumoProducao outro) {
        this.valorTotalProducao = this.valorTotalProducao.add(outro.valorTotalProducao);
        this.valorTotalImposto = this.valorTotalImposto.add(outro.valorTotalImposto);
    }

}
