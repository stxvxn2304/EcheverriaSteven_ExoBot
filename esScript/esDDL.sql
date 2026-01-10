-- database: ../esDatabase/esEXOBOT.sqlite
/*
CopyRight 2K25 EPN
Autor: stevenE
Fecha: 03.enero.2025
Script: Creacion de la estructura de datos para Exabot
*/

DROP TABLE IF EXISTS esPersona;
DROP TABLE IF EXISTS esExaBot;
DROP TABLE IF EXISTS esIABot;
DROP TABLE IF EXISTS esCatalogo;
DROP TABLE IF EXISTS esCatalogoTipo;

CREATE TABLE esCatalogoTipo (
     esIdCatalogoTipo    INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,esNombre            VARCHAR(10) NOT NULL UNIQUE
    ,esDescripcion       VARCHAR(90) NOT NULL UNIQUE

    ,esEstado            VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,esFechaCreacion     DATETIME    DEFAULT (datetime('now','localtime'))
    ,esFechaModifica     DATETIME 
);

CREATE TABLE esCatalogo (
     esIdCatalogo       INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,esIdCatalogoTipo   INTEGER     NOT NULL REFERENCES esCatalogoTipo(esIdCatalogoTipo)
    ,esNombre           VARCHAR(10) NOT NULL UNIQUE
    ,esDescripcion      VARCHAR(90) NOT NULL

    ,esEstado           VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,esFechaCreacion    DATETIME    DEFAULT (datetime('now','localtime'))
    ,esFechaModifica    DATETIME
);

CREATE TABLE esIABot (
     esIdIABot        INTEGER     PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(20) NOT NULL UNIQUE
    ,esObservacion    TEXT
    ,esFechaCreacion  DATETIME    DEFAULT (datetime('now','localtime'))
);

CREATE TABLE esExaBot (
     esIdExaBot      INTEGER      PRIMARY KEY AUTOINCREMENT
    ,esIdIABot       INTEGER      NOT NULL
    ,esNombre        VARCHAR(20)  NOT NULL 
    ,esSerie         TEXT NOT NULL   
    ,CONSTRAINT fk_esIABot FOREIGN KEY (esIdIABot) REFERENCES esIABot(esIdIABot)
);


CREATE TABLE esPersona (
     esIdPersona                INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT
    ,esIdCatalogoTipoPersona    INTEGER     NOT NULL REFERENCES esCatalogo(esIdCatalogo)
    ,esIdCatalogoSexo           INTEGER     NOT NULL REFERENCES esCatalogo(esIdCatalogo)
    ,esIdCatalogoEstadoCivil    INTEGER     NOT NULL REFERENCES esCatalogo(esIdCatalogo)
    ,esCedula                   VARCHAR(10) NOT NULL UNIQUE
    ,esNombre                   VARCHAR(50) NOT NULL
    ,esApellido                 VARCHAR(50) NOT NULL

    ,esEstado           VARCHAR(1)  NOT NULL DEFAULT ('A')
    ,esFechaCreacion    DATETIME    DEFAULT (datetime('now','localtime'))
    ,esFechaModifica    DATETIME
);
