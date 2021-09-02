package com.example.imobiliaria.service;

import com.example.imobiliaria.entity.Imovel;
import com.example.imobiliaria.entity.Quarto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
@Service
public class QuartoServices {

  public static List<Quarto> quartoList = new ArrayList<>();


  //Busca o maior quarto de um imovel
    public Quarto comparaQuartos(Imovel imovel){
        quartoList = imovel.getQuartoList();
        for (Quarto quarto:quartoList){
            quarto.setTamanho(quarto.getComprimento()*quarto.getLargura());
        }

        return quartoList.stream()
                .max(Comparator.comparing(Quarto::getTamanho)).get();
    }
}
