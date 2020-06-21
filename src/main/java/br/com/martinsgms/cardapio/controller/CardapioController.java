package br.com.martinsgms.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.dto.CardapioDTO;
import br.com.martinsgms.cardapio.repository.CardapioRepository;


@RestController
@RequestMapping("/cardapio")
public class CardapioController {
    
    @Autowired
    private CardapioRepository repository;

    @GetMapping()
    public List<CardapioDTO> listAll() {

        return CardapioDTO.covert(repository.findAll());
    }

}