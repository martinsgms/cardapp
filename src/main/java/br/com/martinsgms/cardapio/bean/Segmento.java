package br.com.martinsgms.cardapio.bean;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import lombok.Data;

@Data
public class Segmento {
    
    private Long id;
    private String nome;
    private List<Item> itens = new ArrayList<>();
}
