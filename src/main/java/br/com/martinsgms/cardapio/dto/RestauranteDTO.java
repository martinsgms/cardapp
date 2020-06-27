package br.com.martinsgms.cardapio.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.martinsgms.cardapio.bean.Restaurante;
import lombok.Getter;

@Getter
public class RestauranteDTO {

    public RestauranteDTO(Restaurante restaurante) {
        this.id = restaurante.getId();
        this.nome = restaurante.getNome();
        this.cardapio = new CardapioDTO(restaurante.getCardapio());
    }

    private Long id;
    private String nome;
    private CardapioDTO cardapio;

	public static List<RestauranteDTO> covert(List<Restaurante> restaurantes) {
		return restaurantes.stream().map(RestauranteDTO::new).collect(Collectors.toList());
    }
    
	public static Page<RestauranteDTO> covert(Page<Restaurante> restaurantes) {
		return restaurantes.map(RestauranteDTO::new);
	}
}