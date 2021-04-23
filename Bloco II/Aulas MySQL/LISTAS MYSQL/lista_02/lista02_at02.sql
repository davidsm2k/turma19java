CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id 		BIGINT AUTO_INCREMENT,
    tipo	VARCHAR(255) NOT NULL, 	
    valor 	DECIMAL(7,2) NOT NULL,
    tempo 	TIME,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_pizza(
	id 		BIGINT AUTO_INCREMENT,
    sabores VARCHAR(255) NOT NULL,
    bordas	VARCHAR(255) NOT NULL,
    tamanho CHAR(1),
	categoria_id BIGINT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, valor, tempo) VALUES ("FRANGO DOIDO", 59.99, 3500);
INSERT INTO tb_categoria(tipo, valor, tempo) VALUES ("OXENTE", 49.99, 4500);
INSERT INTO tb_categoria(tipo, valor, tempo) VALUES ("PEIXADA", 79.99, 3500);
INSERT INTO tb_categoria(tipo, valor, tempo) VALUES ("GUIÇA", 19.99, 2900);
INSERT INTO tb_categoria(tipo, valor, tempo) VALUES ("RESPILA", 89.99, 4000);

INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("frango c/catupiry", "s/borda", "M", 1);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("PORTUGUESA", "C/borda", "p", 5);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("BAHIANA", "s/borda", "G", 2);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("CARNE SECA C/MUSSARELA", "C/borda", "G", 2);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("ATUM C/MUSSARELA", "C/borda", "M", 3);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("BACON C/MUSSARELA ", "s/borda", "M", 5);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("CALEBRESA C/CEBOLA", "C/borda", "P", 4);
INSERT INTO tb_pizza(sabores, bordas, tamanho, categoria_id) VALUES ("PEPERONE", "s/borda", "G", 4);

select * from tb_categoria;
select * from tb_pizza;
select * from tb_categoria  where valor > 50; 
select * from tb_categoria where valor > 29 and valor < 60;
select * from tb_pizza where sabores like "%c%";
select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.categoria_id; 
select * from tb_pizza where categoria_id = 2;