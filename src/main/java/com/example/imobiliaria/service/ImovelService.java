package com.example.imobiliaria.service;

import com.example.imobiliaria.entity.Imovel;
import com.example.imobiliaria.entity.Quarto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ImovelService {

    List<Imovel> imovelList = new ArrayList<>();

    //Endpoint para cadastrar Imovel
    public Imovel cadastra(Imovel imovel) {
        imovelList.add(imovel);
        return imovel;
    }

    //Busca imovel por nome
    public Imovel buscarImovel(String nome) {
        for(Imovel imovel: imovelList){
            if(imovel.getNome().equals(nome)){
                return imovel;
            }
        }
        return null;
    }

    //Busca por nome do imovel retornando apenas o tamanho do mesmo.
    public Double buscarMetragemImovel(String nome) {
        for(Imovel imovel: imovelList){
            if(imovel.getNome().equals(nome)){
                return imovel.getTamanho();
            }
        }
        return null;
    }

    //Busca por nome do imovel retornando o valor do mesmo
    public Double calcularValorImovel(String nome) {
        for(Imovel imovel: imovelList){
            if(imovel.getNome().equals(nome)){
                return imovel.getTamanho()*800;
            }
        }
        return null;
    }

    //Busca maior quarto
    public Quarto obtemMaiorQuarto(String nome) {
        QuartoServices quartoServices = new QuartoServices();
        for(Imovel imovel: imovelList){
            if(imovel.getNome().equals(nome)){
                return quartoServices.comparaQuartos(imovel);
            }
        }
        return null;
    }


}
