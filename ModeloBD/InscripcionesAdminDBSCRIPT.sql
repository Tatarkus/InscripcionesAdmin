-- MySQL Script generated by MySQL Workbench
-- Mon May  6 16:17:55 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema InscripcionesAdmin
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema InscripcionesAdmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `InscripcionesAdmin` DEFAULT CHARACTER SET utf8 ;
USE `InscripcionesAdmin` ;

-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Tipo_Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Tipo_Usuario` (
  `cod_tipo` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_tipo`))
ENGINE = InnoDB
ROW_FORMAT = DEFAULT;


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Carrera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Carrera` (
  `cod_carrera` INT NOT NULL,
  `nom_carrera` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_carrera`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Malla`
-- -----------------------------------------------------
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


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Usuario` (
  `run` INT NOT NULL,
  `dv` VARCHAR(45) NOT NULL,
  `Malla_cod_malla` INT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `Tipo_usuario` INT NOT NULL,
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


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Ramo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Ramo` (
  `sigla` VARCHAR(6) NOT NULL,
  `nom_ramo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`sigla`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`MallaRamo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`MallaRamo` (
  `Malla_cod_malla` INT NOT NULL,
  `Ramo_sigla` VARCHAR(6) NOT NULL,
  `semestre` INT,
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


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Seccion`
-- -----------------------------------------------------
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


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Bloque`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `InscripcionesAdmin`.`Bloque` (
  `cod_bloque` INT NOT NULL,
  `hora_inicio` TIME NOT NULL,
  `hora_termino` TIME NOT NULL,
  PRIMARY KEY (`cod_bloque`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `InscripcionesAdmin`.`Clase`
-- -----------------------------------------------------
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


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
