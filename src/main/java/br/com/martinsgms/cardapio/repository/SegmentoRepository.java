package br.com.martinsgms.cardapio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.martinsgms.cardapio.bean.Segmento;
import br.com.martinsgms.cardapio.enums.SegmentoType;

public interface SegmentoRepository extends JpaRepository<Segmento, Long> {
    
    List<Segmento> findByTipo(SegmentoType tipo);
}