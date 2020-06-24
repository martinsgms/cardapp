package br.com.martinsgms.cardapio.config.validacao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class ErrorFormDTO {

    public String field;
    public String error;

}
