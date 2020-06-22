package br.com.martinsgms.cardapio.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.martinsgms.cardapio.enums.SegmentoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Segmento {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Enumerated(EnumType.STRING)
    private SegmentoType tipo;
}
