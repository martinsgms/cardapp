package br.com.martinsgms.cardapio.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.martinsgms.cardapio.bean.Cardapio;
import br.com.martinsgms.cardapio.bean.Restaurante;
import lombok.Getter;

@Getter
public class CardapioDTO {

    public CardapioDTO(Cardapio cardapio) {
        this.id = cardapio.getId();
        this.restaurante = cardapio.getRestaurante();
    }

    private Long id;
    private Restaurante restaurante;

	public static List<CardapioDTO> covert(List<Cardapio> cardapios) {
		return cardapios.stream().map(CardapioDTO::new).collect(Collectors.toList());
	}
}