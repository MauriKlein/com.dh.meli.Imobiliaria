package com.example.imobiliaria.entity;

import java.util.List;

public class Imovel {
    private String nome;
    private String endereco;
    private double tamanho;
    private List<Quarto> quartoList;

    public Imovel(String nome, String endereco, double tamanho, List<Quarto> quartoList) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.quartoList = quartoList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public List<Quarto> getQuartoList() {
        return quartoList;
    }

    public void setQuartoList(List<Quarto> quartoList) {
        this.quartoList = quartoList;
    }
}

