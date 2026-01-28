-- © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
-- database: esStorage\esDatabases\esAntCiberDron.sqlite
DROP TABLE IF EXISTS esHormigaAntCiberDron;
DROP TABLE IF EXISTS esHormigaAlimento;
DROP TABLE IF EXISTS esAlimento;
DROP TABLE IF EXISTS esAntCiberDron;
DROP TABLE IF EXISTS esHormiga;
DROP TABLE IF EXISTS esSexo;
DROP TABLE IF EXISTS esEstado;
DROP TABLE IF EXISTS esHormigaTipo;
DROP TABLE IF EXISTS esAlimentoTipo; 
DROP TABLE IF EXISTS esEntomologo;

CREATE TABLE esEntomologo(
     esIdEntomologo   INTEGER PRIMARY KEY AUTOINCREMENT
    ,esUsuario        VARCHAR(15) NOT NULL UNIQUE
    ,esClave          VARCHAR(15) NOT NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
 
CREATE TABLE esAlimentoTipo(
     esIdAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esHormigaTipo (
     esIdHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esEstado (
     esIdEstado       INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esSexo (
     esIdSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esHormiga (
     esIdHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,esIdHormigaTipo  INTEGER NOT NULL REFERENCES esHormigaTipo (esIdHormigaTipo)
    ,esIdSexo         INTEGER NOT NULL REFERENCES esSexo        (esIdSexo)
    ,esIdEstado       INTEGER NOT NULL REFERENCES esEstado      (esIdEstado)
    ,esNombre         VARCHAR(20) NOT NULL
    ,esDescripcion    VARCHAR(20) NULL

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esAntCiberDron (
     esIdAntCiberDron   INTEGER PRIMARY KEY AUTOINCREMENT
    ,esSerie            VARCHAR(10) NOT NULL  UNIQUE
    ,Estado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esAlimento     (
    esIdAlimento        INTEGER PRIMARY KEY AUTOINCREMENT
    ,esIdAlimentoTipo   INTEGER NOT NULL REFERENCES esAlimentoTipo  (esIdAlimentoTipo)
    ,esNombre           VARCHAR(20) NOT NULL
    ,esDescripcion      VARCHAR(20) NULL

    ,Estado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))           
);
CREATE TABLE esHormigaAlimento  (
    esIdHormigaAlimento         INTEGER PRIMARY KEY AUTOINCREMENT
    ,esIdHormiga                INTEGER NOT NULL REFERENCES esHormiga (esIdHormiga)
    ,esIdAlimento               INTEGER NOT NULL REFERENCES esAlimento (esIdAlimento)
    ,esDescripcion              VARCHAR(20) NULL

    ,Estado                     VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion              DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica              DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))           
);
CREATE TABLE esHormigaAntCiberDron (
    esIdHormigaAntCiberDron     INTEGER PRIMARY KEY AUTOINCREMENT
    ,esIdHormiga                INTEGER NOT NULL REFERENCES esHormiga (esIdHormiga)
    ,esIdAntCiberDron           INTEGER NOT NULL REFERENCES esAntCiberDron (esIdAntCiberDron)
    ,esDescripcion              VARCHAR(20) NULL

    ,Estado                     VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion              DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica              DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))           
);

INSERT INTO esSexo 
 (esNombre, esDescripcion)  VALUES 
 ('Macho'  ,'masculino')
,('Hembra' ,'femenina') 
,('Hibrido','Hibrido')
,('Asexual','Asexual');

INSERT INTO esAlimentoTipo
 (esNombre,     esDescripcion)  VALUES
 ('Nectarívoro' ,'Comida para HLarva')
,('Herbívoro'   ,'Comida para HObrera');

INSERT INTO esHormigaTipo
 (esNombre,     esDescripcion)  VALUES 
 ('Larva'       ,'en etapa de larva')
,('Obrera'      ,'encargada de trabajar');

INSERT INTO esEstado
 (esNombre, esDescripcion)  VALUES 
 ('Vive' ,'está viva'),
 ('Muere','ha muerto');

INSERT INTO esAntCiberDron
(esSerie)     VALUES 
('S001'),
('S002'),
('S003'),
('S004');


SELECT * FROM esSexo;
SELECT * FROM esHormigaTipo;
SELECT * FROM esEstado;
SELECT * FROM esAlimentoTipo;
SELECT * FROM esEstado;

DROP VIEW IF EXISTS vwesHormiga;

CREATE VIEW vwesHormiga AS
SELECT 
     H.esIdHormiga
    ,HT.esNombre AS esTipo
    ,S.esNombre  AS esSexo
    ,E.esNombre  AS esEstadoHormiga
    ,H.esNombre  AS esNombre
    ,H.esDescripcion
    ,H.Estado
    ,H.FechaCreacion
    ,H.FechaModifica
FROM esHormiga H
JOIN esHormigaTipo    HT ON H.esIdHormigaTipo = HT.esIdHormigaTipo
JOIN esSexo           S  ON H.esIdSexo        = S.esIdSexo
JOIN esEstado         E  ON H.esIdEstado      = E.esIdEstado
WHERE H.Estado = 'A';

SELECT * FROM vwesHormiga;

--TESTING:


-- SELECT esIdHormiga
-- ,esTipo
-- ,esSexo
-- ,esEstadoHormiga
-- ,esNombre
-- ,esDescripcion
-- ,Estado
-- ,FechaCreacion
-- ,FechaModifica  
-- FROM vwesHormiga;


-- SELECT * FROM esHormiga;

UPDATE esEstado SET esNombre = 'VIVA'
WHERE esIdEstado = 1;

UPDATE esEstado   SET esNombre = 'MUERTA'
WHERE esIdEstado = 2;

SELECT * FROM esEstado;

SELECT * FROM esEntomologo;

SELECT esIdEntomologo  
,esUsuario       
,esClave         
,Estado        
,FechaCreacion 
,FechaModifica  
FROM esEntomologo 
WHERE esUsuario = 'patmic' AND esClave = '1234';

-- INSERT INTO esAlimento 
-- (esIdAlimentoTipo,  esNombre,        esDescripcion) VALUES 
-- (1,                 'esNectarivoro' ,'Comida para HLarva'),
-- (2,                 'esHerbivoro'   ,'Comida para HObrera');

-- INSERT INTO esHormigaAlimento 
-- (esIdHormiga, esIdAlimento) VALUES 
-- (1, 1),
-- (2, 2),
-- (3, 3);

-- INSERT INTO esHormigaAntCiberDron 
-- (esIdHormiga, esIdAntCiberDron) VALUES 
-- (1, 1),
-- (2, 2),
-- (3, 3);