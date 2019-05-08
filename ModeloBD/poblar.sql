
-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Bloque`
-- -----------------------------------------------------

INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (1, '08:30:00', '09:15:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (2, '09:16:00', '10:00:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (3, '10:01:00', '10:45:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (4, '10:46:00', '11:30:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (5, '11:31:00', '12:15:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (6, '12:16:00', '13:00:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (7, '13:01:00', '13:45:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (8, '13:46:00', '14:30:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (9, '14:31:00', '15:15:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (10, '15:16:00', '16:00:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (11, '16:01:00', '16:45:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (12, '16:45:00', '17:30:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (13, '17:31:00', '18:15:00')
INSERT INTO inscripcionesadmin.bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (14, '18:16:00', '19:00:00')


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`CARRERA`
-- -----------------------------------------------------

INSERT INTO inscripcionesadmin.carrera (cod_carrera, nom_carrera) 
	VALUES (1, 'Ingeniería en Informática')
INSERT INTO inscripcionesadmin.carrera (cod_carrera, nom_carrera) 
	VALUES (2, 'Gastronomía Internacional')
INSERT INTO inscripcionesadmin.carrera (cod_carrera, nom_carrera) 
	VALUES (3, 'Ingeniería en conectividad de redes')
INSERT INTO inscripcionesadmin.carrera (cod_carrera, nom_carrera) 
	VALUES (4, 'Eco-turismo')
INSERT INTO inscripcionesadmin.carrera (cod_carrera, nom_carrera) 
	VALUES (5, 'Ingeniería en Comercio Exterior')


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`MALLAS`
-- -----------------------------------------------------


INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (1, 'INGI01', 1)
INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (2, 'INGI02', 1)
INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (3, 'GAST01', 2)
INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (4, 'INGC01', 3)
INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (5, 'ECOT01', 4)
INSERT INTO inscripcionesadmin.malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (6, 'INCE', 5)

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`RAMOS`
-- -----------------------------------------------------

INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('ADMBD', 'Administración Base de Datos');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('ARQSW', 'Arquitectura de Software');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('COCI1', 'Cocina 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('ESTD1', 'Estadistica 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('FRNB1', 'Francés Básico 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('HISTM', 'Historia del Mundo');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('IDSYS', 'Integración de Sistemas');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('INGA1', 'Inglés Avanzado 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('INGA2', 'Inglés Avanzado 2');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('INGB1', 'Inglés Básico 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('INGB2', 'Inglés Básico 2');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('INGSW', 'Ingeniería de Software');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('MAT1', 'Matemáticas 1');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('MAT2', 'Matemáticas 2');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('MATFIN', 'Matematicas Financieras');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('PRGBD', 'Programación Base de Datos');
INSERT INTO inscripcionesadmin.ramo (sigla, nom_ramo) 
	VALUES ('PRJVW', 'Programación Java Web');
