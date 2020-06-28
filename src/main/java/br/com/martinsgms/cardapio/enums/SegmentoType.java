package br.com.martinsgms.cardapio.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.StringUtils;

public enum SegmentoType {

    ENTRADA,
    BEBIDA,
    SOBREMESA,
    MASSA,
    HAMBURGER,
    PIZZA;

    public static SegmentoType getFromName(String name) {
        
        if(StringUtils.isEmpty(name) || !StringUtils.hasText(name))
            throw new IllegalArgumentException("Invalid enum name");

        return new ArrayList<SegmentoType>(
            Arrays.asList(SegmentoType.values()))
                .stream()
                .filter(e -> e.name().equals(name))
                .findFirst()
                .get();
    }
    
}
