package br.com.martinsgms.cardapio.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    
    Page<Restaurante> findByNome(String nome, Pageable pagination);
}