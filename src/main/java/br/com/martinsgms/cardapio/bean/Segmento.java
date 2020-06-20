package br.com.martinsgms.cardapio.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Segmento {
    
    private Long id;
    private String nome;
    private List<Item> itens = new ArrayList<>();
}
