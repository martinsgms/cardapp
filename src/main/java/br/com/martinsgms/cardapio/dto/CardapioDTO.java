package br.com.martinsgms.cardapio.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.martinsgms.cardapio.bean.Cardapio;
import br.com.martinsgms.cardapio.bean.Restaurante;
import br.com.martinsgms.cardapio.bean.Segmento;
import lombok.Getter;

@Getter
public class CardapioDTO {

    public CardapioDTO(Cardapio cardapio) {
        this.id = cardapio.getId();
        this.restaurante = cardapio.getRestaurante();
        this.segmentos = cardapio.getSegmentos();
    }

    private Long id;
    private Restaurante restaurante;
    private List<Segmento> segmentos = new ArrayList<>();

}