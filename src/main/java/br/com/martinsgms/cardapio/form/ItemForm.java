package br.com.martinsgms.cardapio.form;

import java.math.BigDecimal;
import java.util.List;

import br.com.martinsgms.cardapio.bean.Item;
import br.com.martinsgms.cardapio.bean.Segmento;
import br.com.martinsgms.cardapio.enums.SegmentoType;
import br.com.martinsgms.cardapio.repository.SegmentoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemForm {
    
    private String nomeRestaurante;    
    private String nomeSegmento;
    private String nomeItem;
    private BigDecimal valor;

	public Item toItem(SegmentoRepository segmentoRepository) {
        //List<Restaurante> restaurante = restauranteRepository.findByNome(nomeRestaurante);
        List<Segmento> segmento = segmentoRepository.findByTipo(SegmentoType.getFromName(nomeSegmento));

        return new Item(null, segmento.get(0), nomeItem, valor);
	}  

}