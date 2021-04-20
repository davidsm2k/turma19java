-- Cria um banco de dados
create database db_quitanda;

-- acessa o bancod de dados
use db_quitanda;

-- criando tabela
create table tb_produtos(
	id bigint AUTO_INCREMENT,
    nome varchar(255) not null,
    preco float not null,
    primary key(id)
); 

-- inserir uma informação na tabela
insert into tb_produtos (nome, preco) values ("mamao", 2.50);
insert into tb_produtos (nome, preco) values ("melancia", 1.50);
insert into tb_produtos (nome, preco) values ("caju", 5.00);

-- buscar um produto
select * from tb_produtos;
select * from tb_produtos where preco > 3;

-- Alterando informacoes da tabela
alter table tb_produtos add descricao varchar(255); -- adicionando coluna
alter table tb_produtos drop descricao; -- excluindo coluna

-- Deletando informacoes
delete from tb_produtos where id=2; -- deletando dado inserido no banco de dados

-- Atualizando dados da tabela
update tb_produtos set preco = 10 where id = 3;
update tb_produtos set nome = "uva" where id = 3;
update tb_produtos set nome = "banana" where id = 4;