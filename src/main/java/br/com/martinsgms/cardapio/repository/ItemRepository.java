package br.com.martinsgms.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}