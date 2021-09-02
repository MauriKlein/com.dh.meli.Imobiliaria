package com.example.imobiliaria.entity;

public class Quarto {
    private String nome;
    private double largura;
    private double comprimento;
    private double tamanho;

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
