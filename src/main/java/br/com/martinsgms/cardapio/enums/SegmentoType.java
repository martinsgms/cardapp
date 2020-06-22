package br.com.martinsgms.cardapio.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SegmentoType {

    ENTRADA,
    BEBIDA,
    SOBREMESA,
    MASSA,
    HAMBURGER,
    PIZZA;

    public static SegmentoType getFromName(String name) {
        List<SegmentoType> enums = new ArrayList<>(Arrays.asList(SegmentoType.values())); 

        return enums.stream().filter(e -> e.name().equals(name)).findFirst().get();
    }
    
}
