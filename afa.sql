DROP DATABASE afa;
CREATE DATABASE IF NOT EXISTS afa;
USE afa;

create table direccion(
 id_direccion INT PRIMARY KEY AUTO_INCREMENT,
 calle VARCHAR(100),
 nro INT,
 localidad VARCHAR(100),
 provincia VARCHAR(100)
);

create table persona(
 dni INT PRIMARY KEY NOT NULL,
 apellido VARCHAR(50),
 nombre VARCHAR(50),
 email VARCHAR(50),
 telefono VARCHAR(50),
 id_direccion INT,
 constraint fk_direccion_persona
 foreign key (id_direccion)
 references direccion(id_direccion)
);

create table jugador(
 dni INT PRIMARY KEY,
 fecha_debut DATE,
 fecha_retiro DATE,
 cant_partidos INT,
 fecha_nacimiento DATE,
 cant_goles INT,
 peso INT,
 altura INT,
 constraint fk_dni_jugador
 foreign key (dni)
 references persona(dni)
);

create table dt(
 dni INT PRIMARY KEY,
 fecha_fin DATE,
 fecha_inicio DATE,
 constraint fk_dni_dt
 foreign key (dni)
 references persona(dni)
);

create table equipo(
 cuit_equipo INT PRIMARY KEY,
 nombre VARCHAR(50),
 email VARCHAR(50),
 telefono VARCHAR(50),
 fecha_fundacion DATE,
 fecha_primera_division DATE,
 presidente_apellido_nombre VARCHAR(50),
 categoria CHAR,
 id_direccion INT,
 constraint fk_direccion_equipo
 foreign key (id_direccion)
 references direccion(id_direccion)
);

create table historial(
 id_historial INT PRIMARY KEY AUTO_INCREMENT,
 fecha_inicio DATE,
 fecha_fin DATE,
 posicion VARCHAR(50),
 jugador_dni int,
 cuit_equipo int,
 constraint fk_jugador
 foreign key (jugador_dni)
 references jugador(dni),
 constraint fk_equipo
 foreign key (cuit_equipo)
 references equipo(cuit_equipo)
);
