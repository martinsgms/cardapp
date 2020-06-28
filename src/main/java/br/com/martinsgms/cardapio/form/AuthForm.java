package br.com.martinsgms.cardapio.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthForm {
    
    private String email;
    private String senha;

	public UsernamePasswordAuthenticationToken covert() {
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}