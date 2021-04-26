CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categoria(
	id				BIGINT AUTO_INCREMENT,
    tipo			VARCHAR(255),
    ativo			BOOLEAN,
    PRIMARY KEY(id)
);

CREATE TABLE tb_curso(
	id				BIGINT AUTO_INCREMENT,
    descricao		VARCHAR(255),
    semestre		INT,
    valor			DECIMAL(7,2),
    categoria_id	BIGINT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, ativo) VALUES ("JAVA", true);
INSERT INTO tb_categoria(tipo, ativo) VALUES ("ANGULAR", true);
INSERT INTO tb_categoria(tipo, ativo) VALUES ("MYSQL", true);
INSERT INTO tb_categoria(tipo, ativo) VALUES ("SPRING BOOT", true);
INSERT INTO tb_categoria(tipo, ativo) VALUES ("SCRUM", true);

INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Programação Orientada a Objetos", 1, 350.54, 1);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Front-End", 3, 290.00, 2);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Back-End", 2, 447.37, 1);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Metodologias Ageis", 2, 397.29, 5);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Lógica de Programação", 1, 350.54, 1);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Spring MVC", 3, 159.34, 4);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Banco de Dados Relacional", 2, 243.45, 3);
INSERT INTO tb_curso(descricao, semestre, valor, categoria_id) VALUES ("Etapas do Scrum", 2, 153.14, 5);

SELECT * FROM tb_categoria;
SELECT * FROM tb_curso;
SELECT * FROM tb_curso WHERE valor > 300;
SELECT * FROM tb_curso WHERE valor > 150 AND valor < 200;
SELECT * FROM tb_curso WHERE descricao LIKE "%J%";
SELECT descricao AS NOME, semestre AS BLOCO, valor AS PRECO, tipo AS TEMA 
	FROM tb_curso INNER JOIN tb_categoria ON tb_curso.categoria_id = tb_categoria.id;
SELECT * FROM tb_curso WHERE categoria_id = 5;