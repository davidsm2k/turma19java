CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
	id 			BIGINT AUTO_INCREMENT,
    tipo		VARCHAR(255) NOT NULL,
    disponivel	BOOLEAN,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
	id 				BIGINT AUTO_INCREMENT,
    nome			VARCHAR(255) NOT NULL,
    preco			DECIMAL(7,2) NOT NULL,
    validade		DATE,
    categoria_id	BIGINT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (tipo, disponivel) VALUES ("PESCADOS", true);
INSERT INTO tb_categoria (tipo, disponivel) VALUES ("BOVINO", true);
INSERT INTO tb_categoria (tipo, disponivel) VALUES ("AVES", true);
INSERT INTO tb_categoria (tipo, disponivel) VALUES ("SUINOS", true);
INSERT INTO tb_categoria (tipo, disponivel) VALUES ("OUTROS", true);

insert into tb_produto ( nome, preco, validade,categoria_id) values("picanha", 80.00, "2021-04-30", 2);
insert into tb_produto ( nome, preco, validade,categoria_id) values("file de frango  ", 15.00, "2021-05-11", 3);
insert into tb_produto ( nome, preco, validade,categoria_id) values("file de melusa ", 30.00, "2021-12-04", 1);
insert into tb_produto ( nome, preco, validade,categoria_id) values("costala de porco magra ", 60.00, "2021-04-12", 4);
insert into tb_produto ( nome, preco, validade,categoria_id) values("patinho ", 60.00, "2021-05-01", 2);
insert into tb_produto ( nome, preco, validade,categoria_id) values("cupim ", 60.00, "2022-08-20", 2);
insert into tb_produto ( nome, preco, validade,categoria_id) values("linguiça apimentada", 25.00, "2025-04-20", 4);
insert into tb_produto ( nome, preco, validade,categoria_id) values("coração d/galinha", 40.00, "2021-04-29", 3);

select * from tb_categoria;
select * from tb_produto;
select * from tb_produto where preco > 50; 
select * from tb_produto where preco > 3 and preco < 60;
select * from tb_produto where nome like "%c%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id; 
select * from tb_produto where categoria_id = 2;