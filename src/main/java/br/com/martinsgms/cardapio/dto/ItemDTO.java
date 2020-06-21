package br.com.martinsgms.cardapio.dto;

import java.math.BigDecimal;

import br.com.martinsgms.cardapio.bean.Item;
import lombok.Getter;

@Getter
public class ItemDTO {

    public ItemDTO(Item item) {
        this.id = item.getId();
        this.segmento = new SegmentoDTO(item.getSegmento());
        this.nome = item.getNome();
        this.valor = item.getValor();
    }

    private Long id;
    private SegmentoDTO segmento;
    private String nome;
    private BigDecimal valor; 
}
