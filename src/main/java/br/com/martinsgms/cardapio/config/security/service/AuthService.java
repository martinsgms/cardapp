package br.com.martinsgms.cardapio.config.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.martinsgms.cardapio.bean.Usuario;
import br.com.martinsgms.cardapio.repository.UsuarioRepository;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> user = usuarioRepository.findByEmail(username);

        if (!user.isPresent()) 
            throw new UsernameNotFoundException("Usuário/Senha inválido");            

        return user.get();
    }

}
