package br.com.martinsgms.cardapio.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Restaurante {
    
    @Id @GeneratedValue
    private Long id;
    
    private String nome;
}
