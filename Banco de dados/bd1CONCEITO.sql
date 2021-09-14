 -- Criar Tabela
 CREATE TABLE clientes(
     nome VARCHAR (30),
     idade INTEGER,
     email VARCHAR (50)
 );

 --LISTAR TODAS AS BASES DE DADOS
 SHOW DATABASES;

 --EXIBIR ESTRUTURA DA TABELA
 DESCRIBE usuarios;

 --RENOMEAR TABELA
 ALTER TABLE clientes RENAME TO usuarios;

 --ADICIONAR NOVA COLUNA

 ALTER TABLE usuarios ADD COLUMN cidade VARCHAR (30);
 ---REMOVER COLUNA
 ALTER TABLE usuarios DROP COLUMN cidade;



 --INSERIR DADOS
 INSERT INTO usuarios VALUES ("Jean", 22, "jean.silva@gmail.com");
 INSERT INTO usuarios (nome, email) VALUES ("Rebecca", "rebecca.souza@gmail.com");
 --INSERIR VARIOS DADOS DE UMA VEZ
INSERT INTO usuarios VALUES 
("Ana", 12,"ana@gmail.com"),
("Fernanda", 21, "fernanda.fp15@gmail.com"),
("Joao", 29, "joaoloes@gmail.com"),
("Larissa", 34, "larissa@gmail.com"),
("Luluzinha",23, "luluzinhaluiz@gmail.com");

 -- SELECIONAR DADOS

 SELECT * FROM usuarios;-- SELECIONAR TODOS OS REGISTROS
 SELECT nome, idade FROM usuarios;--SELECIONAR TODOS OS REGISTROS E EXIBIR O DADO PRETENDIDO
 SELECT COUNT(*)FROM usuarios; -- CONTAR REGISTROS QUE TEM NA TABELA
SELECT MAX(idade) FROM usuarios;-- OBTÊM O MAIOR VALOR DA COLUNA
SELECT MIN(idade) FROM usuarios;-- OBTÊM O MENOR VALOR DA COLUNA
SELECT AVG(idade) FROM usuarios;-- OBTÊM A MÉDIA DE UMA DETERMINADA COLUNA
 SELECT 
 idade ,
 IF (idade>=18, "Maior de idade", "Menor de idade")
 FROM usuarios;--EXIBIR A IDADE E RETORNAR UMA MENSAGEMS
 SELECT * FROM usuarios WHERE idade >=18; --FILTRAR DADOS
 SELECT * FROM usuarios WHERE idade IS NULL; -- FILTAR REGISTROS ONDE A COLUNA SEJA NULA
 SELECT * FROM usuarios WHERE idade IS NOT NULL; -- FILTAR REGISTROS ONDE NÃO SEJA NULA
 SELECT * FROM usuarios ORDER BY nome;-- ORDENAR POR ORDEM ALFABÉTICA OU CRESCENTE(pode ser nome/idade)
 SELECT * FROM usuarios ORDER BY nome DESC;--ORDENAR EM ORDEM ALFABÉTICA (Z-A) OU DECRESCENTE
 SELECT * FROM usuarios WHERE nome LIKE "f%";--INICIA COM F
 SELECT * FROM usuarios WHERE nome LIKE "%a";--FINALIZA COM A LETRA/TERMO A
 SELECT * FROM usuarios WHERE nome LIKE "%e%";--CONTÊM A LETRA/TERMO E

SELECT * FROM usuarios WHERE email LIKE "%gmail.com" AND idade >= 30;-- EXIBIR REGISTROS QUE TERMINA COM TERMO GMAIL.COM E COM IDADE MAIOR OU IGUAL A 30


--ALTERAR DADOS
UPDATE usuarios SET idade = 27 WHERE  idade IS NULL;--ALTERAR A IDADE PARA 27 DO USUARIO COM IDADE NULA


--REMOVER DADOS
DELETE FROM usuarios WHERE idade < 18;


---REMOVER TABELA
DROP TABLE usuarios;

-- REMOVER BASE DE DADOS
DROP DATABASE bd1;















