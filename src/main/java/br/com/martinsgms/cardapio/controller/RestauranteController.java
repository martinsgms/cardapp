package br.com.martinsgms.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.dto.RestauranteDTO;
import br.com.martinsgms.cardapio.repository.RestauranteRepository;


@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    
    @Autowired
    private RestauranteRepository repository;

    @GetMapping()
    public List<RestauranteDTO> listAll(String nome) {

        if(!StringUtils.isEmpty(nome))
            return RestauranteDTO.covert(repository.findByNome(nome));

        return RestauranteDTO.covert(repository.findAll());
    }

}