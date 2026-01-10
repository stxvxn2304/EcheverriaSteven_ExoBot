-- database: ../esDatabase/esEXOBOT.sqlite
/*
CopyRight 2K25 EPN
Autor: stevenE
Fecha: 03.enero.2025
Script: Insertando catalogo
*/

INSERT INTO esCatalogoTipo 
(esNombre,          esDescripcion) VALUES 
 ('Tipo de Persona', 'tipos, soldado, mecanico')
,('Sexo',            'Masculino, Femenino')
,('Estado Civil',    'Soltero, Casado, Divorciado')
,('Raza',            'Negro, Blanco, Mestizo, Indigena');

INSERT INTO esCatalogo
(esIdCatalogoTipo,   esNombre,            esDescripcion   ) VALUES 
 (1,                 'Soldado',          'tipos de persona del ejercito') --1
,(1,                 'Mecanico',         'tipos de persona del ejercito') --2
,(1,                 'Experto Ing.',     'tipos de persona del ejercito') --3
,(1,                 'Experto Esp.',     'tipos de persona del ejercito') --4

,(2,                 'Masculino',        'tipos de sexualidad') --5
,(2,                 'Femenino',         'tipos de sexualidad') --6
,(2,                 'Hibrido',          'tipos de sexualidad') --7
,(2,                 'Asexual',          'tipos de sexualidad') --8

,(3,                 'Soltero',          'tipos de estado civil Ecuador') --9
,(3,                 'Casado',           'tipos de estado civil Ecuador') --10
,(3,                 'Divorciado',       'tipos de estado civil Ecuador') --11
,(3,                 'Viudo',            'tipos de estado civil Ecuador') --12

,(4,                 'Negro',            'tipos de raza') --13
,(4,                 'Blanco',           'tipos de raza') --14
,(4,                 'Mestizo',          'tipos de raza') --15
,(4,                 'Indigena',         'tipos de raza'); --16

INSERT INTO esIABot (esNombre,  esObservacion)
            VALUES  ("IA-RUSO", "Inteligencia artificial");

INSERT INTO esExabot (esIdIABot, esNombre,  esSerie)
            VALUES  (1,          "exabot1", "Serie E1")
                    ,(1,          "exabot2", "Serie E2");

INSERT INTO esPersona   (esIdCatalogoTipoPersona, esIdCatalogoSexo, esIdCatalogoEstadoCivil, esCedula,      esNombre,  esApellido) VALUES
                        (1                       ,5                ,9                       ,"1274893098"  ,"Juan"    ,"Pérez")
                       ,(2                       ,5                ,10                      ,"1782393434"  ,"Pepe"    ,"Aguilar")
                       ,(3                       ,5                ,11                      ,"2134343456"  ,"Pedro"   ,"Gomez")
                       ,(4                       ,5                ,12                      ,"3425435657"  ,"Jose"    ,"Lopez")
                       ,(2                       ,6                ,9                       ,"3562546643"  ,"Maria"   ,"Fernandez")
                       ,(3                       ,6                ,10                      ,"3426565467"  ,"Camila"  ,"Torres")
                       ,(1                       ,6                ,11                      ,"1728488349"  ,"Ariana"  ,"Hinojosa")
                       ,(4                       ,6                ,12                      ,"1234944599"  ,"Fernanda","Ruiz");
