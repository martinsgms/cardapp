package br.com.martinsgms.cardapio.form;

import br.com.martinsgms.cardapio.bean.Restaurante;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RestauranteForm {
    
    private String nome;

    public Restaurante toRestaurante() {
        return new Restaurante(nome);
    }
}