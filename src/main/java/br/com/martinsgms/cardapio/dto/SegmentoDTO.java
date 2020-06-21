package br.com.martinsgms.cardapio.dto;

import br.com.martinsgms.cardapio.bean.Segmento;
import br.com.martinsgms.cardapio.enums.SegmentoType;
import lombok.Getter;

@Getter
public class SegmentoDTO {

    public SegmentoDTO(Segmento segmento) {
        this.id = segmento.getId();
        this.tipo = segmento.getTipo();
    }

    private Long id;
    private SegmentoType tipo;
}
