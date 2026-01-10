DROP TABLE IF EXISTS esSexo;

CREATE TABLE esSexo (
     esIdSexo         INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(10) NOT NULL UNIQUE

    ,esEstado         VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,esFechaCreacion  DATETIME    DEFAULT (datetime('now','localtime'))
    ,esFechaModifica  DATETIME 
);

INSERT INTO esSexo (esNombre) VALUES 
("Femenino"),
("Masculino"),
("Hibrido");
 --UPDATE esSexo SET esNombre = "CAMBIO" WHERE esIdSexo = 4;

SELECT * FROM esSexo;

SELECT esIdSexo, esNombre 
FROM esSexo
WHERE esEstado = 'A' AND esIdSexo = 2;

SELECT count(*)
FROM esSexo 
WHERE esEstado = 'A';

