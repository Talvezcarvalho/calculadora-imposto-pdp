package com.example.Modelo;

import java.math.BigDecimal;

public class Producao {
    private Produto produto;
    private int quantidade;
    private BigDecimal valorUnitario;
    private UnidadeFederacao localProducao;

    public Producao(Produto produto, int quantidade, BigDecimal valorUnitario, UnidadeFederacao localProducao) {
        super();
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.localProducao = localProducao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public UnidadeFederacao getlocalProducao() {
        return localProducao;
    }

    public void setlocalProducao(UnidadeFederacao localProducao) {
        this.localProducao = localProducao;
    }

}
