package br.com.martinsgms.cardapio.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.bean.Cardapio;
import br.com.martinsgms.cardapio.bean.Restaurante;
import br.com.martinsgms.cardapio.bean.Segmento;
import br.com.martinsgms.cardapio.bean.Item;


@RestController
@RequestMapping("/cardapio")
public class CardapioController {
    
    @GetMapping()
    public Cardapio findAll() {

        List<Item> itens = new ArrayList<>(Arrays.asList(new Item("Salada", new BigDecimal(11.90))));
        List<Segmento> segmentos = new ArrayList<>(Arrays.asList(new Segmento(1L, "Entradas", itens)));

        return new Cardapio(1L, new Restaurante(1L, "Restaurante da Dona Florinda"), segmentos);
    }

}