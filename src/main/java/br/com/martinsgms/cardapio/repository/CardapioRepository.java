package br.com.martinsgms.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {
    
}