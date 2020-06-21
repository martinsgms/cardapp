package br.com.martinsgms.cardapio.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.martinsgms.cardapio.bean.Cardapio;
import lombok.Getter;

@Getter
public class CardapioDTO {

    public CardapioDTO(Cardapio cardapio) {
        this.id = cardapio.getId();
        this.itens = cardapio.getItens().stream().map(ItemDTO::new).collect(Collectors.toList());
	}
	private Long id;
    private List<ItemDTO> itens = new ArrayList<>();
}
