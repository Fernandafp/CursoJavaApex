
--QUETÃO 1
CREATE TABLE Produtos(
codigo INTEGER,
nome VARCHAR(20),
marca VARCHAR(20),
valor DOUBLE
);
--QUESTÃO 2
INSERT INTO Produtos VALUES
(1, "GalaxyS10", "Samsung", 5000),
(2, "iPhone 11", "Apple", 6000),
(3, "Moto G7", "Motorola", 1500),
(4, "Galaxy Note 10", "Samsung", 6500),
(6, "iPhone 8", "Apple", 3000);

---Questão 3
SELECT*FROM Produtos;

---QUESTÃO 4
--Exibir todas as marcas, não pode haver repetição do nome das marcas
SELECT MARCA FROM Produtos GROUP BY MARCA;

---QUESTÃO 5
--Exibir o nome das marcas e a quantidade de produtos naquela marca (O nome da marca não pode se repetir)
SELECT MARCA, COUNT(*)FROM PRODUTOS group by MARCA;
 
---QUESTÃO 6
--Selecione todos os produtos das marcas Apple e Samsung
SELECT marca FROM Produtos WHERE (MARCA="SAMSUNG" OR MARCA = "APPLE");

---QUESTÃO 7
--Selecione todos os produtos das marcas Apple e Samsung com valor inferior a R$6000,00
SELECT marca FROM Produtos WHERE (MARCA="SAMSUNG" OR MARCA = "APPLE") AND valor < 6000;

---QUESTÃO 8
--Insira o produto: iPhone 11 Max, da marca Apple no valor de R$6.500,00
INSERT INTO Produtos VALUES
(7,"iPhone 11 Max","Apple",6500);

---Questão 9
--Remover todos os produtos da marca Samsung
DELETE FROM Produtos Where (marca = "Samsung");

---Questão 10
-- Excluir a tabela
DROP TABLE Produtos;