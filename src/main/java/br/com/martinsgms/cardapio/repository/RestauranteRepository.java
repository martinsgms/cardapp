package br.com.martinsgms.cardapio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    
    List<Restaurante> findByNome(String nome);
}