CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id			BIGINT AUTO_INCREMENT,
    tipo		VARCHAR(60) NOT NULL,
	valor		DECIMAL(7,2) NOT NULL,
    quant		INT(100) NOT NULL,
    descricao	VARCHAR(255),
    
    PRIMARY KEY(id)
);

INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("ELETRONICO", 49.99, 3, "MOUSE");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("ELETRONICO", 129.99, 1, "TECLADO ELETRICO");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("PERSONALIZADO", 35.50, 4, "CANECA VINGADORES");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("LITERATURA", 29.99, 2, "LIVRO: O MILAGRE DA MANHÃ");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("LITERATURA", 29.99, 2, "LIVRO: O MILAGRE DA MANHÃ P/ TRANSFORMAR SEU RELACIONAMENTO");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("PLANNER", 28.00, 5, "AGENDA");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("ESCRITÓRIO", 59.99, 7, "CANETA TINTEIRO");
INSERT INTO tb_produtos(tipo, valor, quant, descricao) VALUES("MOCHILA", 29.99, 4, "PORTA NOTEBOOK");

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE valor > 500;
SELECT * FROM tb_produtos WHERE valor < 500;

UPDATE tb_produtos SET valor = 500.99 WHERE id = 2;