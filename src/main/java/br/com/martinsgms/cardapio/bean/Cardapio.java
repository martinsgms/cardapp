package br.com.martinsgms.cardapio.bean;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Cardapio {
    
    private Long id;
    private Restaurante restaurante;
    private List<Segmento> segmentos = new ArrayList<>();

}
