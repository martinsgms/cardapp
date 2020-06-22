package br.com.martinsgms.cardapio.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.martinsgms.cardapio.bean.Restaurante;
import br.com.martinsgms.cardapio.dto.RestauranteDTO;
import br.com.martinsgms.cardapio.form.RestauranteForm;
import br.com.martinsgms.cardapio.repository.CardapioRepository;
import br.com.martinsgms.cardapio.repository.RestauranteRepository;



@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    
    @Autowired
    private RestauranteRepository restauranteRepository;
   
    @Autowired
    private CardapioRepository cardapioeRepository;

    @GetMapping 
    public List<RestauranteDTO> listAll(String nome) {

        if(!StringUtils.isEmpty(nome))
            return RestauranteDTO.covert(restauranteRepository.findByNome(nome));

        return RestauranteDTO.covert(restauranteRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<RestauranteDTO> novoRestaurante(
        @RequestBody @Valid RestauranteForm form,
        UriComponentsBuilder uriBuilder) {

        Restaurante restaurante = form.toRestaurante();
        
        cardapioeRepository.save(restaurante.getCardapio());
        restauranteRepository.save(restaurante);

        URI uri = uriBuilder.path("/restaurante/{id}")
            .buildAndExpand(restaurante.getId())
            .toUri();

        return ResponseEntity.created(uri)
            .body(new RestauranteDTO(restaurante));
    }
}