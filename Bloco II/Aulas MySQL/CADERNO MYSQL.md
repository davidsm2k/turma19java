##### COMANDOS:

###### Criar banco de dados: 

- **create database** *nome_do_bd*

###### Usar bando de dados:

- **use** *nome_do_bd*

###### Criando tabela

- **create table** *nome_da_tb*(

  ​	id				**bigint *AUTO_INCREMENT***,

  ​	nome 		**varchar(*255*) *not null***,

  ​	preco		**float *not null***,

  ​	**primary key**(***id***)

  );

###### Inserir uma informação na tabela

- **insert into** *nome_da_tb* (nome, preco) **values** ("mamao", 2.50);



###### Buscar uma info na tabela

- **select** * **from** *nome_da_tb*;
- **select** * **from** *nome_da_tb* **where** id = 2;
- **select** * **from** *nome_da_tb* **where** preco > 2;

Todos os dados com letras BA:

- **select** * **from** *nome_da_tb* **where** nome **Like** "%Ba%";

Todos os dados com primeira letra C:

- **select** * **from** *nome_da_tb* **where** nome **Like** "C%";

Todos os dados com preços de 30, 20 e 40 reias:

- **select** * **from** *nome_da_tb* **where** preco **in** (30, 20, 40) ;

Todos os dados com preços entre 20 e 40 reias:

- **select** * **from** *nome_da_tb* **where** preco **beetween** 20 **and** 40;

Media ponderada

- **select** **AVG** (preco) **as** media **from** *nome_da_tb*;

Mostra quantos dados existem na tabela

- **select** **COUNT** (*)**from** *nome_da_tb*;

Soma os dados que foram solicitados para soma

- **select SUM**(*preco*) **FROM** *nome_da_tb* **WHERE** nome = *"Picanha"*;
- **SELECT SUM**(*preco*) **FROM** *tb_produtos* **WHERE** nome **LIKE** *"%Picanha%"*;

MOSTRA TUDO QUE ESTA RELACIONADO ENTRE AS TABELAS 

- **select** * **from** *nome_da_tb* 

  ​		**inner join** *nome_da_tb_estrangeira* 

  ​				**on** *nome_da_tb_estrangeira*.id = td_produtos.categoria_id;

MOSTRA TUDO QUE ESTA RELACIONADO ENTRE AS TABELAS E A TABELA TODA DA DIREITA

- **left join**

MOSTRA TUDO QUE ESTA RELACIONADO ENTRE AS TABELAS E A TABELA TODA DA ESQUERDA

- **right join**

###### Alterar info tabela

- alter table *nome_da_tb* add descricao varchar(255); -- adicionando coluna
- alter table *nome_da_tb* drop descricao; -- excluindo coluna



###### Deletando informacoes

- delete from *nome_da_tb* where id=2; -- deletando dado inserido no banco de dados

  

###### Atualizando dados da tabela

- update *nome_da_tb* set preco = 10 where id = numero_do_id;
- update *nome_da_tb* set nome = "uva" where id = numero_do_id;

