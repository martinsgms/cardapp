package br.com.martinsgms.cardapio.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.martinsgms.cardapio.bean.Restaurante;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RestauranteForm {
    
    @NotNull @NotEmpty @NotBlank
    private String nome;

    public Restaurante toRestaurante() {
        return new Restaurante(nome);
    }
}