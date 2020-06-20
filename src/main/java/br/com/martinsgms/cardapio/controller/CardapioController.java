package br.com.martinsgms.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cardapio")
public class CardapioController {
    
    @GetMapping()
    public String getMethodName() {
        return "hello";
    }
    
}