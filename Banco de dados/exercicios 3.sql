---1)
CREATE TABLE uzuarios(
codigo INTEGER,
nome VARCHAR(20),
sobrenome VARCHAR(50),
idade INT
);

--2)
ALTER TABLE uzuarios RENAME TO Usuarios;

--3)
ALTER TABLE usuarios ADD COLUMN email VARCHAR(40);

--4)
ALTER TABLE usuarios DROP COLUMN SOBRENOME;

--5)
INSERT INTO usuarios VALUES
(1, "Vanessa", 16, "vanessa.rosa@gmail.com"),
(2, "Adailton", 22, "adailton.maas@yahoo.com.br"),
(3, "Andressa", 36, "dessa.simas@uol.com.br"),
(4, "Mayra", 24, "mayra.antunes@gmail.com"),
(5, "Cristiane", 14, "criss.maya@gmail.com"),
(6, "Leonardo", 15, "leo.kopff@terra.com.br"),
(7, "Carina", 27, "carina.almeida@gmail.com"),
(8, "Clóvis", 29, "clovis.simao@hotmail.com"),
(9, "Gabriela", 23, "gabriela.braga@live.com"),
(10, "Cibele", null, "cibele.lins@uol.com.br");

--6)
SELECT codigo FROM usuarios;
SELECT * FROM usuarios;

--7)
 SELECT idade , IF (idade>=18, "Maior de idade", "Menor de idade")
 FROM usuarios;

 8)SELECT * FROM usuarios WHERE email LIKE "%gmail.com" AND 

