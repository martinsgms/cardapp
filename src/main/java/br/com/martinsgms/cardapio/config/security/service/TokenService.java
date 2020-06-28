package br.com.martinsgms.cardapio.config.security.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.martinsgms.cardapio.bean.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
    
    @Value("${cardapio.jwt.expiration}")
    private String expiration;

    @Value("${cardapio.jwt.secret}")
    private String secret;

	public String generate(Authentication authenticate) {
        Usuario principal = (Usuario) authenticate.getPrincipal();
        
        return Jwts.builder()
                .setIssuer("API Cardapp")
                .setSubject(principal.getId().toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + Long.valueOf(expiration)))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
	}
    
}