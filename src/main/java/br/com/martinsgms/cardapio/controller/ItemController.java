package br.com.martinsgms.cardapio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.martinsgms.cardapio.bean.Item;
import br.com.martinsgms.cardapio.form.ItemForm;
import br.com.martinsgms.cardapio.repository.ItemRepository;
import br.com.martinsgms.cardapio.repository.SegmentoRepository;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    private ItemRepository itemRepository;
    
    @Autowired
    private SegmentoRepository segmentoRepository;
    
    @PostMapping
    public Item gravarItem(@RequestBody ItemForm itemForm) {
        return itemRepository.save(itemForm.toItem(segmentoRepository));
    }

}