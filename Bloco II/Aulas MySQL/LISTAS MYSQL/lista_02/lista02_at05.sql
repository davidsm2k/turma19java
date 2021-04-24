CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	id 			BIGINT AUTO_INCREMENT,
    tipo		VARCHAR(255) NOT NULL,
    disponivel	BOOLEAN,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
	id				BIGINT AUTO_INCREMENT,
    descricao		VARCHAR(255) NOT NULL,
    tamanho			VARCHAR(255),
    quantidade		INT NOT NULL,
    valor 			DECIMAL(7,2)NOT NULL,
    categoria_id	BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, disponivel) VALUES ("Alvenaria & Concreto", true);
INSERT INTO tb_categoria(tipo, disponivel) VALUES ("Madeira", true);
INSERT INTO tb_categoria(tipo, disponivel) VALUES ("Pintura", true);
INSERT INTO tb_categoria(tipo, disponivel) VALUES ("Aço", true);
INSERT INTO tb_categoria(tipo, disponivel) VALUES ("Azuleijo", true);

INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Balde de Tinta Acrilica", "18 litros", 3, 150.00, 3);
INSERT INTO tb_produto(descricao, quantidade, valor, categoria_id) VALUES ("Azuleijos para banheiro", 70, 169.99, 5);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Saco de Cimento", "50 kg", 15, 35.00, 1);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Barra de 3/8", "10,7 mm", 8, 72.00, 4);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Tábuas", "2,5x15cm", 5, 100.00, 2);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Tijolo 6 furos", "10x15x25cm", 100, 85.00, 1);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor, categoria_id) VALUES ("Galão de Tinta Esmalte Sintético", "3,6 litros", 6, 25.00, 3);
INSERT INTO tb_produto(descricao, tamanho, quantidade, valor,categoria_id) VALUES ("Varas de Bracatinga", "4 metros", 60, 333.59, 2);


SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;
SELECT * FROM tb_produto WHERE valor > 50;
SELECT * FROM tb_produto WHERE valor > 3 AND valor < 60; 
SELECT * FROM tb_produto WHERE descricao LIKE "%C%"; 
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;
