package br.com.martinsgms.cardapio.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Item {
    
    private String nome;
    private BigDecimal valor; 

}