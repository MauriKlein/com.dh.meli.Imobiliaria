package com.example.imobiliaria.controllers;

import com.example.imobiliaria.entity.Imovel;
import com.example.imobiliaria.entity.Quarto;
import com.example.imobiliaria.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    //Cadastra um imovel na lista de Imóveis (ImovelService)
    @PostMapping("/cadastra")
    public Imovel cadastra(@RequestBody Imovel imovel) {
        return imovelService.cadastra(imovel);
    }

    //Endpoint que busca um imóvel por nome;
    @GetMapping("/{nome}")
    public Imovel obtemImovel(@PathVariable String nome){
        return imovelService.buscarImovel(nome);
    }

    //Endpoint que retorna o metragem de um imóvel;
    @GetMapping("/metragem/{nome}")
    public Double obtemMetragemImovel(@PathVariable String nome){
        return imovelService.buscarMetragemImovel(nome);
    }

    // b) Indicar o valor do imóvel tendo em conta que se toma como referência 800 USD por metro quadrado.
    @GetMapping("/valor/{nome}")
    public Double obtemValorImovel(@PathVariable String nome){
        return imovelService.calcularValorImovel(nome);
    }

    //c) Retornar os dados do maior quarto (nome, largura e comprimento)
    @GetMapping("/maiorquarto/{nome}")
    public Quarto maiorQuarto(@PathVariable String nome){
        return imovelService.obtemMaiorQuarto(nome);
    }

}
