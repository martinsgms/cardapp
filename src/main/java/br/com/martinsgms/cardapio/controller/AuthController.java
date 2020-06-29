package br.com.martinsgms.cardapio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.config.security.service.TokenService;
import br.com.martinsgms.cardapio.dto.TokenDTO;
import br.com.martinsgms.cardapio.form.AuthForm;


@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<?> doAuth(@RequestBody @Valid AuthForm form) {
        UsernamePasswordAuthenticationToken authData = form.covert();

        try {
            Authentication authenticate = authenticationManager.authenticate(authData);
            String token = tokenService.generate(authenticate);

            return ResponseEntity.ok(new TokenDTO(token, "Bearer"));
            
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
}