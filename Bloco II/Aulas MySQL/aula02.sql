CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT,
    descricao	VARCHAR(255) NOT NULL,
    ativo BOOLEAN NOT NULL,
    
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria (descricao, ativo) VALUES ("BOVINO", true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("SUINOS", true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("Aves", true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("PERTENCE FEIJOADA", true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("IMBUTIDOS", true);
INSERT INTO tb_categoria (descricao, ativo) VALUES ("OUTROS", true);

SELECT * FROM tb_categoria;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    preco	DECIMAL NOT NULL,
    qtProduto INT NOT NULL,
    categoria_id BIGINT,
    
    PRIMARY KEY(id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("ASA",40.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("coxa de frango",20.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon",30.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("hamburguer",60.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Orelha de porco",20.00,30,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Salame",18.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("medalhao",50.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("mocoto",20.00,30,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("chuleta",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto) values ("acendedor de churrasqueira",20.00,30);
INSERT INTO tb_produtos (nome, preco, qtProduto, categoria_id) VALUES ("PICANHA X", 10.00,30,1);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE nome LIKE "%Ba%";
SELECT * FROM tb_produtos WHERE preco IN (20, 30, 40);
SELECT * FROM tb_produtos WHERE preco BETWEEN 20 AND 40;

SELECT COUNT(*) FROM tb_categoria; 
SELECT COUNT(*) FROM tb_produtos;
SELECT SUM(preco) FROM tb_produtos WHERE nome = "Picanha";
SELECT SUM(preco) FROM tb_produtos WHERE nome LIKE "%Picanha%";
SELECT AVG(preco) AS media FROM tb_produtos;

SELECT * FROM tb_categoria INNER JOIN tb_produtos ON tb_categoria.id = tb_produtos.categoria_id;
SELECT * FROM tb_categoria LEFT JOIN tb_produtos ON tb_categoria.id = tb_produtos.categoria_id;
SELECT * FROM tb_categoria RIGHT JOIN tb_produtos ON tb_categoria.id = tb_produtos.categoria_id;

select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;
 
select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos left join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;
 
select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos right join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;
