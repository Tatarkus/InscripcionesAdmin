
-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Bloque`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (1, '08:30:00', '09:15:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (2, '09:16:00', '10:00:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (3, '10:01:00', '10:45:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (4, '10:46:00', '11:30:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (5, '11:31:00', '12:15:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (6, '12:16:00', '13:00:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (7, '13:01:00', '13:45:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (8, '13:46:00', '14:30:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (9, '14:31:00', '15:15:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (10, '15:16:00', '16:00:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (11, '16:01:00', '16:45:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (12, '16:45:00', '17:30:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (13, '17:31:00', '18:15:00');
INSERT INTO InscripcionesAdmin.Bloque (cod_bloque, hora_inicio, hora_termino) 
	VALUES (14, '18:16:00', '19:00:00');


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`CARRERA`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Carrera (cod_carrera, nom_carrera) 
	VALUES (1, 'Ingeniería en Informática');
INSERT INTO InscripcionesAdmin.Carrera (cod_carrera, nom_carrera) 
	VALUES (2, 'Gastronomía Internacional');
INSERT INTO InscripcionesAdmin.Carrera (cod_carrera, nom_carrera) 
	VALUES (3, 'Ingeniería en conectividad de redes');
INSERT INTO InscripcionesAdmin.Carrera (cod_carrera, nom_carrera) 
	VALUES (4, 'Eco-turismo');
INSERT INTO InscripcionesAdmin.Carrera (cod_carrera, nom_carrera) 
	VALUES (5, 'Ingeniería en Comercio Exterior');


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`MALLAS`
-- -----------------------------------------------------


INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (1, 'INGI01', 1);
INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (2, 'INGI02', 1);
INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (3, 'GAST01', 2);
INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (4, 'INGC01', 3);
INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (5, 'ECOT01', 4);
INSERT INTO InscripcionesAdmin.Malla (cod_malla, nom_malla, `Carrera_cod_carrera`) 
	VALUES (6, 'INCE', 5);

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`RAMOS`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('ADMBDA', 'Administración Base de Datos');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('ARQSW', 'Arquitectura de Software');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('BPM', 'Procesos de Negocio');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('COCI1', 'Cocina 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('EMPR', 'Emprendimiento');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('ESTD1', 'Estadistica 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('ETCAP', 'Ética Profesional');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('EVAPRO', 'Evaluación de Proyectos');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('FRNB1', 'Francés Básico 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('HISTM', 'Historia del Mundo');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('IDSYS', 'Integración de Sistemas');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGA1', 'Inglés Avanzado 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGA2', 'Inglés Avanzado 2');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGB1', 'Inglés Básico 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGB2', 'Inglés Básico 2');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGI1', 'Inglés Intermedio 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGI2', 'Inglés Intermedio 2');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('INGSW', 'Ingeniería de Software');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('MAT1', 'Matemáticas 1');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('MAT2', 'Matemáticas 2');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('MATFIN', 'Matematicas Financieras');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('PRAWM', 'Programación Aplicaciones Web Mobile');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('PRGBD', 'Programación Base de Datos');
INSERT INTO InscripcionesAdmin.Ramo (sigla, nom_ramo) 
	VALUES ('PRJVW', 'Programación Java Web');


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`MALLARAMO`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGA1', 5);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGA2', 6);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'ADMBDA', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGSW', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'INGSW', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'PRJVW', 5);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'INGA1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'INGA2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'IDSYS', 5);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (2, 'IDSYS', 5);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'INGA1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'INGA2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'COCI1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (4, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (4, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (4, 'INGA1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (4, 'INGA2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (4, 'INGSW', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (5, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (5, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (5, 'INGA1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (5, 'INGA2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (5, 'FRNB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (6, 'INGB1', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (6, 'INGB2', 2);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (6, 'INGA1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (6, 'INGA2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (6, 'MATFIN', 1);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (3, 'FRNB1', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'PRAWM', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'INGI2', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'ARQSW', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'ETCAP', 3);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'EMPR', 4);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'BPM', 5);
INSERT INTO InscripcionesAdmin.MallaRamo (`Malla_cod_malla`, `Ramo_sigla`, semestre) 
	VALUES (1, 'EVAPRO', 5);


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`SECCION`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (1, '001D', 'INGA1');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (2, '002D', 'INGA1');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (3, '003D', 'INGA1');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (4, '001D', 'IDSYS');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (5, '002D', 'IDSYS');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (6, '001D', 'BPM');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (7, '002D', 'BPM');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (8, '001D', 'PRJVW');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (9, '001D', 'EVAPRO');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (10, '002D', 'EVAPRO');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (11, '001D', 'ARQSW');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (12, '002D', 'ARQSW');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (13, '001D', 'INGI2');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (14, '002D', 'INGI2');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (15, '003D', 'INGI2');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (16, '001D', 'PRAWM');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (17, '002D', 'PRAWM');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (18, '001D', 'EMPR');
INSERT INTO InscripcionesAdmin.Seccion (cod_seccion, seccion, `Ramo_sigla`) 
	VALUES (19, '001D', 'ADMBDA');


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`CLASE`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (1, 1, 1, 'Lunes', 'L21');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (2, 1, 2, 'Lunes', 'L21');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (3, 4, 5, 'Martes', 'L21');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (4, 4, 6, 'Martes', 'L21');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (5, 9, 7, 'Martes', 'AV201');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (6, 9, 8, 'Martes', 'AV201');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (7, 6, 9, 'Martes', 'L28');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (8, 6, 10, 'Martes', 'L28');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (9, 8, 13, 'Martes', 'L19');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (10, 8, 14, 'Martes', 'L19');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (11, 3, 9, 'Miercoles', 'AV401');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (12, 3, 10, 'Miercoles', 'AV401');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (13, 4, 5, 'Jueves', 'T505');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (14, 4, 6, 'Jueves', 'T505');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (15, 6, 9, 'Jueves', 'T505');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (16, 6, 10, 'Jueves', 'T505');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (17, 9, 6, 'Viernes', 'L204');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (18, 9, 7, 'Viernes', 'L204');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (19, 9, 8, 'Viernes', 'L204');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (20, 3, 9, 'Viernes', 'AV401');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (21, 3, 10, 'Viernes', 'AV401');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (22, 8, 12, 'Viernes', 'L16');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (23, 8, 13, 'Viernes', 'L16');
INSERT INTO InscripcionesAdmin.Clase (cod_clase, `Seccion_cod_seccion`, `Bloque_cod_bloque`, `Dia`, `Sala`) 
	VALUES (24, 8, 14, 'Viernes', 'L16');

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`TIPO_USUARIO`
-- -----------------------------------------------------


INSERT INTO InscripcionesAdmin.Tipo_Usuario (cod_tipo, tipo) 
	VALUES (1, 'admin');
INSERT INTO InscripcionesAdmin.Tipo_Usuario (cod_tipo, tipo) 
	VALUES (2, 'superuser');
INSERT INTO InscripcionesAdmin.Tipo_Usuario (cod_tipo, tipo) 
	VALUES (3, 'user');

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`USUARIO`
-- -----------------------------------------------------

INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (11111111, '1', NULL, 'admin', 'admin', '123', 'admin@mail.com', 1, 0);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (11222333, '4', 5, 'Miguel', 'Turista', '123', 'miguel@mail.com', 3, 2);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (12345678, '1', 4, 'Ignacio', 'Fuentes', '123', 'ingacio@mail.com', 3, 1);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (17305233, '2', 1, 'Matias Alonso', 'Fuentes Salinas', '123', 'matias@mail.com', 3, 5);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (19456789, 'k', 3, 'Gordon', 'Ramsay', '123', 'gordon@mail.com', 3, 3);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (20105321, '6', 6, 'James', 'Bezos', '123', 'james@mail.com', 3, 3);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (20123122, '5', 2, 'Carlos Max', 'Mellado', '123', 'carlos@correo.com', 3, 4);
INSERT INTO InscripcionesAdmin.Usuario (run, dv, `Malla_cod_malla`, nombres, apellidos, password, correo, `Tipo_Usuario`, semestre) 
	VALUES (20445121, '9', 1, 'Tomás', 'Farías', '123', 'tomas@mail.com', 3, 5);
