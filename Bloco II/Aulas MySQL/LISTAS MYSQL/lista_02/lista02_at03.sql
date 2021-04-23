CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id 			BIGINT AUTO_INCREMENT,
    tipo		VARCHAR(255)NOT NULL,
    quantidade	int,
    receita		boolean NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
	id 				BIGINT AUTO_INCREMENT,
    nome			VARCHAR(255) NOT NULL,
    valor			DECIMAL(7,2) NOT NULL,
    validade		DATE NOT NULL,
    categoria_id 	BIGINT NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, quantidade, receita) VALUES ("Cosmético", 1, true);
INSERT INTO tb_categoria(tipo, quantidade, receita) VALUES ("Fitoterápico", 3, true);
INSERT INTO tb_categoria(tipo, quantidade, receita) VALUES ("Infantil", 4, true);
INSERT INTO tb_categoria(tipo, quantidade, receita) VALUES ("Vitamina", 2, true);
INSERT INTO tb_categoria(tipo, quantidade, receita) VALUES ("Adulto", 2, true);

insert into tb_produto (nome, valor, validade,categoria_id) values("PARACETAMOL ", 20.00, "2021-07-12", 5);
insert into tb_produto (nome, valor, validade,categoria_id) values("DENTINHO POM/para bebe ", 15.00, "2021-05-11", 3);
insert into tb_produto (nome, valor, validade,categoria_id) values("DIPIRONA ", 20.00, "2021-12-03", 5);
insert into tb_produto (nome, valor, validade,categoria_id) values("DICLOFENACO CONTAGOTA ", 30.00, "2021-07-12", 5);
insert into tb_produto (nome, valor, validade,categoria_id) values("TIONACHO ", 60.00, "2023-08-12", 1);
insert into tb_produto (nome, valor, validade,categoria_id) values("VITAC", 11.00, "2022-08-20", 3);
insert into tb_produto (nome, valor, validade,categoria_id) values("RIMEL SAARA", 25.00, "2025-03-20", 1);
insert into tb_produto (nome, valor, validade,categoria_id) values("DESINCHA ", 80.00, "2021-07-12", 2);

select * from tb_categoria;
select * from tb_produto;
select * from tb_produto  where valor > 50; 
select * from tb_produto where valor > 3 and valor < 60;
select * from tb_produto where nome like "%b%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id; 
select * from tb_produto where categoria_id = 5;
