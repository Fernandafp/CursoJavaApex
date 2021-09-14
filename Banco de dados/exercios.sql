---- QUESTÃO 1
CREATE TABLE Alunos(
    nome VARCHAR (30),
    idade INTEGER,
    nota1 DOUBLE,
    nota2 DOUBLE
);
 
-----QUESTÃO 2
--INSERIR DADOS
INSERT INTO Alunos VALUES("Ana", 15, 7.5, 8.2);
INSERT INTO Alunos VALUES("Lucas",null, 9, 8.6);
INSERT INTO Alunos VALUES("Vanessa", 16, 6.6, 7.1);
INSERT INTO Alunos VALUES("Dênis", 17, 10, 10);

---QUESTÃO 3
 SELECT * FROM Alunos;

 ---QUESTÃO 4
SELECT nome, (nota1+nota2)/2 FROM Alunos;
--- QUESTÃO 5
SELECT nome, (nota1+nota2)/2 FROM Alunos;

SELECT 
nome,
(nota1+nota2)/2,
IF((nota1+nota2)/2 >=7, "Aprovado", "Reprovado")
FROM Alunos
ORDER BY (nota1+nota2)/2;

---QUESTÃO 6
SELECT 
nome,
(nota1+nota2)/2
FROM Alunos Where idade <=16;

---QUESTÃO 7
SELECT * FROM Alunos WHERE idade IS NULL;

---QUESTÃO 8
 SELECT * FROM Alunos ORDER BY nome;
 ---Questão 9
 SELECT * FROM Alunos WHERE nome LIKE "%l%";
 ---Questão 10
 SELECT * FROM Alunos WHERE nome LIKE "a%";
---QUESTÃO 11
 SELECT * FROM Alunos WHERE nome LIKE "%a";
 ---QUESTÃO 12
SELECT COUNT(*)FROM alunos;
---QUESTÃO 13
SELECT SUM(idade) FROM Alunos;
---QUESTÃO 14 E 15/16
SELECT MAX(idade) FROM Alunos;
SELECT MIN(idade) FROM Alunos;
---QUESTÃO 17
UPDATE Alunos SET idade = 15 WHERE  idade IS NULL;
---QUESTÃO 18
DELETE FROM Alunos WHERE idade < 15;
---QUESTÃO 19
DROP TABLE Alunos;