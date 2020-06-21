 INSERT INTO CARDAPIO (ID) VALUES (1);
 INSERT INTO CARDAPIO (ID) VALUES (2);
 INSERT INTO CARDAPIO (ID) VALUES (3);

INSERT INTO RESTAURANTE (ID, CARDAPIO_ID, NOME) VALUES (1, 1, 'Restaurante da Dona Florinda');
INSERT INTO RESTAURANTE (ID, CARDAPIO_ID, NOME) VALUES (2, 2, 'Siri Cascudo');
INSERT INTO RESTAURANTE (ID, CARDAPIO_ID, NOME) VALUES (3, 3, 'Pizza Planet');
 
INSERT INTO SEGMENTO (ID, TIPO) VALUES (1, 'ENTRADA');
INSERT INTO SEGMENTO (ID, TIPO) VALUES (2, 'BEBIDA');
INSERT INTO SEGMENTO (ID, TIPO) VALUES (3, 'SOBREMESA');
INSERT INTO SEGMENTO (ID, TIPO) VALUES (4, 'MASSA');
INSERT INTO SEGMENTO (ID, TIPO) VALUES (5, 'HAMBURGER');
INSERT INTO SEGMENTO (ID, TIPO) VALUES (6, 'PIZZA');
 
--  DONA FLORINDA
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (1, 1, 'Salada temperada', 9.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (2, 2, 'Suco de laranja', 6.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (3, 3, 'Pudim', 5.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (4, 4, 'Macarronada', 21.99);

INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (1, 1);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (1, 2);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (1, 3);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (1, 4);
 
-- SIRI CASCUDO
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (5, 1, 'Porção de ostras', 16.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (6, 2, 'Suco de algas', 9.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (7, 3, 'Doce de Estrela do mar', 5.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (8, 5, 'Hambuerguer de Siri', 15.99);

INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (2, 5);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (2, 6);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (2, 7);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (2, 8);

-- PIZZA PLANET
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (9, 1, 'Porção de fritas', 10.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (10, 2, 'Soda italiana', 8.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (11, 3, 'Doce de leite', 6.99);
INSERT INTO ITEM (ID, SEGMENTO_ID, NOME, VALOR) VALUES (12, 6, 'Pizza de Frango', 33.99);

INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (3, 9);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (3, 10);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (3, 11);
INSERT INTO CARDAPIO_ITENS (CARDAPIO_ID, ITENS_ID) VALUES (3, 12);
                                      