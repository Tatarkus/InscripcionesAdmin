-- MySQL Script generated by MySQL Workbench
-- Mon May 13 20:31:08 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema InscripcionesAdmin
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `InscripcionesAdmin` ;

-- -----------------------------------------------------
-- Schema InscripcionesAdmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `InscripcionesAdmin` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `InscripcionesAdmin` ;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Tipo_Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Tipo_Usuario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Tipo_Usuario` (
  `cod_tipo` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_tipo`))
ENGINE = InnoDB
ROW_FORMAT = DEFAULT;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Carrera`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Carrera` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Carrera` (
  `cod_carrera` INT NOT NULL,
  `nom_carrera` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_carrera`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Malla`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Malla` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Malla` (
  `cod_malla` INT NOT NULL,
  `nom_malla` VARCHAR(45) NOT NULL,
  `Carrera_cod_carrera` INT NOT NULL,
  PRIMARY KEY (`cod_malla`),
  CONSTRAINT `fk_Malla_Carrera1`
    FOREIGN KEY (`Carrera_cod_carrera`)
    REFERENCES `InscripcionesAdmin`.`Carrera` (`cod_carrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Usuario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Usuario` (
  `run` INT NOT NULL,
  `dv` VARCHAR(45) NOT NULL,
  `Malla_cod_malla` INT NULL DEFAULT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `Tipo_usuario` INT NOT NULL,
  `semestre` INT NOT NULL,
  PRIMARY KEY (`run`),
  CONSTRAINT `fk_Alumno_Malla1`
    FOREIGN KEY (`Malla_cod_malla`)
    REFERENCES `InscripcionesAdmin`.`Malla` (`cod_malla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tipo_Usuario_Usuario1`
    FOREIGN KEY (`Tipo_usuario`)
    REFERENCES `InscripcionesAdmin`.`Tipo_Usuario` (`cod_tipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Ramo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Ramo` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Ramo` (
  `sigla` VARCHAR(6) NOT NULL,
  `nom_ramo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`sigla`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`MallaRamo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`MallaRamo` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`MallaRamo` (
  `Malla_cod_malla` INT NOT NULL,
  `Ramo_sigla` VARCHAR(6) NOT NULL,
  `semestre` INT NULL DEFAULT NULL,
  CONSTRAINT `fk_MallaRamo_Malla1`
    FOREIGN KEY (`Malla_cod_malla`)
    REFERENCES `InscripcionesAdmin`.`Malla` (`cod_malla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MallaRamo_Ramo1`
    FOREIGN KEY (`Ramo_sigla`)
    REFERENCES `InscripcionesAdmin`.`Ramo` (`sigla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Seccion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Seccion` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Seccion` (
  `cod_seccion` INT NOT NULL,
  `seccion` VARCHAR(45) NOT NULL,
  `Ramo_sigla` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`cod_seccion`),
  CONSTRAINT `fk_Seccion_Ramo1`
    FOREIGN KEY (`Ramo_sigla`)
    REFERENCES `InscripcionesAdmin`.`Ramo` (`sigla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Bloque`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Bloque` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Bloque` (
  `cod_bloque` INT NOT NULL,
  `hora_inicio` TIME NOT NULL,
  `hora_termino` TIME NOT NULL,
  PRIMARY KEY (`cod_bloque`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Clase`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Clase` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Clase` (
  `cod_clase` INT NOT NULL,
  `Seccion_cod_seccion` INT NOT NULL,
  `Bloque_cod_bloque` INT NOT NULL,
  `Dia` VARCHAR(10) NOT NULL,
  `Sala` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`cod_clase`),
  CONSTRAINT `fk_Clase_Seccion1`
    FOREIGN KEY (`Seccion_cod_seccion`)
    REFERENCES `InscripcionesAdmin`.`Seccion` (`cod_seccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Clase_Bloque1`
    FOREIGN KEY (`Bloque_cod_bloque`)
    REFERENCES `InscripcionesAdmin`.`Bloque` (`cod_bloque`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Horario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Horario` ;
SHOW WARNINGS;

CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Horario` (
  `cod_horario` INT NOT NULL,
  `Usuario_run` INT NOT NULL,
  `Clase_cod_clase` INT NOT NULL,
  PRIMARY KEY (`cod_horario`),
  CONSTRAINT `fk_Horario_Usuario1`
    FOREIGN KEY (`Usuario_run`)
    REFERENCES `InscripcionesAdmin`.`Usuario` (`run`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Horario_Clase1`
    FOREIGN KEY (`Clase_cod_clase`)
    REFERENCES `InscripcionesAdmin`.`Clase` (`cod_clase`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Contacto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `InscripcionesAdmin`.`Contacto` ;

CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Contacto` (
  `id_contacto` INT NOT NULL AUTO_INCREMENT,
  `nombre_contacto` VARCHAR(30) NOT NULL,
  `correo` VARCHAR(30) NOT NULL,
  `telefono` INT NOT NULL,
  `motivo` VARCHAR(30) NOT NULL,
  `requerimiento` VARCHAR(300) NOT NULL,
  `fecha_envio` DATE NOT NULL,
  PRIMARY KEY (`id_contacto`))
ENGINE = InnoDB;
SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- -----------------------------------------------------
-- MURO DE LA VERGÜENZA
-- -----------------------------------------------------
/*
create table if not exists CONTACTO
(
ID_CONTACTO INTEGER not null primary key auto_increment,
NOMBRE_CONTACTO VARCHAR(30) not null,

CORREO VARCHAR(30) not null,
TELEFONO int not null,
MOTIVO VARCHAR(30) not null,
REQUERIMIENTO VARCHAR(300) not null,
FECHA_ENVIO date
);30
*/
-- -----------------------------------------------------
-- MURO DE LA VERGÜENZA
-- -----------------------------------------------------