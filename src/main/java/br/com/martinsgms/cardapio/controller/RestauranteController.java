package br.com.martinsgms.cardapio.controller;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Cacheable(value = "listAllRestaurantes")
    public Page<RestauranteDTO> listAllRestaurantes(@RequestParam(required = false) String nome,
        @PageableDefault(page = 0, size = 10, sort = "nome", direction = Direction.ASC) Pageable pagination) {
        
        if(!StringUtils.isEmpty(nome))
            return RestauranteDTO.covert(restauranteRepository.findByNome(nome, pagination));

        return RestauranteDTO.covert(restauranteRepository.findAll(pagination));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findRestauranteById(@PathVariable Long id) {

        Optional<Restaurante> searchRestaurante = restauranteRepository.findById(id);

        if(!searchRestaurante.isPresent())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(new RestauranteDTO(searchRestaurante.get()));
    }
    

    @PostMapping
    @CacheEvict(value = "listAllRestaurantes", allEntries = true)
    public ResponseEntity<RestauranteDTO> newRestaurante(@RequestBody @Valid RestauranteForm form,
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

    @PutMapping("/{id}")
    @CacheEvict(value = "listAllRestaurantes", allEntries = true)
    public ResponseEntity<?> updateRestaurantee(@PathVariable Long id,
        @RequestBody @Valid RestauranteForm form) {

        Optional<Restaurante> searchRestaurante = restauranteRepository.findById(id);

        if(!searchRestaurante.isPresent())
            return ResponseEntity.notFound().build();
        
        Restaurante restaurante = searchRestaurante.get();

        restaurante.merge(form);
        return ResponseEntity.ok(restauranteRepository.save(restaurante));
    }

    @DeleteMapping("/{id}")
    @CacheEvict(value = "listAllRestaurantes", allEntries = true)
    public ResponseEntity<?> deleteRestaurante(@PathVariable Long id) {
        
        Optional<Restaurante> searchRestaurante = restauranteRepository.findById(id);

        if(!searchRestaurante.isPresent())
            return ResponseEntity.notFound().build();

        restauranteRepository.deleteById(id);

        return ResponseEntity.ok().build();
    }
}