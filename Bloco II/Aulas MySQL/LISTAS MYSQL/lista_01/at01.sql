CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionarios(
	id_funcionario	BIGINT AUTO_INCREMENT,
    nome 			VARCHAR(255) NOT NULL,
    cpf				CHAR(11) NOT NULL,
    genero			CHAR(1),
    salario			DECIMAL(10,2) NOT NULL,
    funcao			VARCHAR(255) NOT NULL,

    PRIMARY KEY(id_funcionario),
    CHECK(genero IN('F', 'M', 'O'))
);

INSERT INTO tb_funcionarios(nome, cpf, genero, salario, funcao) VALUES ("DAVID", "12435145678", 'O', 2500.75, "DESENVOLVEDORE FULLSTACK JAVA JUNIOR");
INSERT INTO tb_funcionarios(nome, cpf, genero, salario, funcao) VALUES ("LUCAS", "87756243545", 'M', 5619.45, "INSTRUTOR BANCO DE DADOS GENERATION BRASIL");
INSERT INTO tb_funcionarios(nome, cpf, genero, salario, funcao) VALUES ("PEDRO", "75423695875", 'M', 1531.17, "JOVEM APRENDIZ");
INSERT INTO tb_funcionarios(nome, cpf, genero, salario, funcao) VALUES ("MAY", "45632178995", 'F', 1999.99, "DESENVOLVEDORE FULLSTACK JAVA JUNIOR");
INSERT INTO tb_funcionarios(nome, cpf, genero, salario, funcao) VALUES ("LUA", "75843957821", 'O', 900.00, "ESTAGIARIO");

SELECT * FROM tb_funcionarios;
SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios SET salario = 2500.00 WHERE id_funcionario = 4;

