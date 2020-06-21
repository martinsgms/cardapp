package br.com.martinsgms.cardapio.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.bean.Cardapio;
import br.com.martinsgms.cardapio.bean.Restaurante;
import br.com.martinsgms.cardapio.bean.Segmento;
import br.com.martinsgms.cardapio.repository.CardapioRepository;
import br.com.martinsgms.cardapio.bean.Item;


@RestController
@RequestMapping("/cardapio")
public class CardapioController {
    
    @Autowired
    private CardapioRepository repository;

    @GetMapping()
    public String findAll() {

        return "";
    }

}