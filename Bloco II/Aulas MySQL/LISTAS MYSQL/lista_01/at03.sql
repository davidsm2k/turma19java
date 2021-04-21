CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id 			BIGINT AUTO_INCREMENT,
    nome		VARCHAR(255) NOT NULL,
    matricula	BIGINT,
    nascimento 	DATE,
    periodo 	CHAR(1),
    nota 		FLOAT(4,2),
    
    PRIMARY KEY(id)
);

INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("DAVID", 54110, "1998-11-23", 'N', 10.0);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("MAY", 54112, "1999-05-25", 'N', 7.50);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("FLORA", 54113, "2000-01-10", 'M', 6.00);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("MARIA", 54114, "1968-06-03", 'V', 9.75);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("STEFANIE", 54115, "1997-06-05", 'V', 8.70);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("THOR", 54116, "2016-04-08", 'N', 5.75);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("PANTUFA", 54117, "2002-08-04", 'M', 4.13);
INSERT INTO tb_alunos(nome, matricula, nascimento, periodo, nota) VALUES("LUA", 54118, "2000-12-19", 'M', 3.89);

SELECT * FROM tb_alunos;
SELECT * FROM tb_alunos WHERE nota > 7;
SELECT * FROM tb_alunos WHERE nota < 7;

UPDATE tb_alunos SET nota = 6.34 WHERE id = 6;