package br.com.martinsgms.cardapio.bean.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {
    
}