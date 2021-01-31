-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 31, 2021 at 01:00 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `afa`
--

-- --------------------------------------------------------

--
-- Table structure for table `direccion`
--

CREATE TABLE `direccion` (
  `id_direccion` int(11) NOT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `nro` int(11) DEFAULT NULL,
  `localidad` varchar(100) DEFAULT NULL,
  `provincia` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `direccion`
--

INSERT INTO `direccion` (`id_direccion`, `calle`, `nro`, `localidad`, `provincia`) VALUES
(1, 'A', 2, 'La Boca', 'Buenos Aires'),
(2, 'B', 8, 'Nuñez', 'Buenos Aires'),
(3, 'C', 6, 'Chacarita', 'Cordoba'),
(4, 'D', 7, 'Auriel', 'Mendoza');

-- --------------------------------------------------------

--
-- Table structure for table `dt`
--

CREATE TABLE `dt` (
  `dni` int(11) NOT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `equipo`
--

CREATE TABLE `equipo` (
  `cuit_equipo` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `fecha_fundacion` date DEFAULT NULL,
  `fecha_primera_division` date DEFAULT NULL,
  `presidente_apellido_nombre` varchar(50) DEFAULT NULL,
  `categoria` char(1) DEFAULT NULL,
  `id_direccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `equipo`
--

INSERT INTO `equipo` (`cuit_equipo`, `nombre`, `email`, `telefono`, `fecha_fundacion`, `fecha_primera_division`, `presidente_apellido_nombre`, `categoria`, `id_direccion`) VALUES
(1, 'Boca', 'boca@email.com', '9', '1905-05-03', '1913-02-10', 'Jorge Amor', 'A', 1),
(2, 'River', 'river@email.com', '9', '1901-05-25', '1925-05-03', 'Rodolfo DOnofrio', 'A', 2),
(3, 'San Lorenzo', 'casla@email.com', '43', '1908-04-01', '1925-05-03', 'Marcelo Tinelli', 'A', 3);

-- --------------------------------------------------------

--
-- Table structure for table `historial`
--

CREATE TABLE `historial` (
  `id_historial` int(11) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `posicion` varchar(50) DEFAULT NULL,
  `jugador_dni` int(11) DEFAULT NULL,
  `cuit_equipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `historial`
--

INSERT INTO `historial` (`id_historial`, `fecha_inicio`, `fecha_fin`, `posicion`, `jugador_dni`, `cuit_equipo`) VALUES
(1, '2020-04-30', NULL, 'defensor', 1, 1),
(2, '2020-04-30', NULL, 'portero', 2, 1),
(3, '2020-04-30', NULL, 'mediocentro', 3, 2),
(4, '2020-04-30', NULL, 'delantero', 4, 2),
(5, '2020-04-30', NULL, 'portero', 5, 2),
(6, '2020-04-30', NULL, 'mediocentro', 6, 2),
(7, '2020-04-30', NULL, 'defensor', 7, 3),
(8, '2020-04-30', NULL, 'delantero', 8, 3),
(9, '2020-04-30', NULL, 'defensor', 9, 3),
(10, '2003-04-30', '2004-04-30', 'defensor', 1, 3),
(11, '2004-04-30', '2005-04-30', 'delantero', 1, 1),
(12, '2012-04-30', '2015-04-30', 'defensor', 1, 1),
(13, '2001-04-30', '2003-04-30', 'defensor', 9, 1),
(14, '2009-04-30', '2010-04-30', 'portero', 9, 2),
(15, '2015-04-30', '2017-04-30', 'delantero', 9, 2);

-- --------------------------------------------------------

--
-- Table structure for table `jugador`
--

CREATE TABLE `jugador` (
  `dni` int(11) NOT NULL,
  `fecha_debut` date DEFAULT NULL,
  `fecha_retiro` date DEFAULT NULL,
  `cant_partidos` int(11) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `cant_goles` int(11) DEFAULT NULL,
  `peso` int(11) DEFAULT NULL,
  `altura` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jugador`
--

INSERT INTO `jugador` (`dni`, `fecha_debut`, `fecha_retiro`, `cant_partidos`, `fecha_nacimiento`, `cant_goles`, `peso`, `altura`) VALUES
(1, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(2, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(3, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(4, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(5, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(6, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(7, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(8, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2),
(9, '2001-10-21', NULL, 201, '1984-02-05', 58, 69, 2);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `dni` int(11) NOT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `id_direccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`dni`, `apellido`, `nombre`, `email`, `telefono`, `id_direccion`) VALUES
(1, 'Tevez', 'Carlos', 'tevez@email.com', '78', NULL),
(2, 'Villa', 'Sebastian', 'villa@email.com', '87', 4),
(3, 'Santos', 'Rafael', 'rafael@email.com', '87', 4),
(4, 'Carrascal', 'Jorge', 'jorge@email.com', '87', NULL),
(5, 'Fernandez', 'Ignacio', 'ignacio@email.com', '87', NULL),
(6, 'Ponzio', 'Leonardo', 'leonard@email.com', '87', NULL),
(7, 'Gattoni', 'Federico', 'federico@email.com', '87', NULL),
(8, 'Romero', 'Angel', 'angel@email.com', '87', NULL),
(9, 'Santo', 'Franco', 'franco@email.com', '87', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id_direccion`);

--
-- Indexes for table `dt`
--
ALTER TABLE `dt`
  ADD PRIMARY KEY (`dni`);

--
-- Indexes for table `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`cuit_equipo`),
  ADD KEY `fk_direccion_equipo` (`id_direccion`);

--
-- Indexes for table `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`id_historial`),
  ADD KEY `fk_jugador` (`jugador_dni`),
  ADD KEY `fk_equipo` (`cuit_equipo`);

--
-- Indexes for table `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`dni`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `fk_direccion_persona` (`id_direccion`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `direccion`
--
ALTER TABLE `direccion`
  MODIFY `id_direccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `historial`
--
ALTER TABLE `historial`
  MODIFY `id_historial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dt`
--
ALTER TABLE `dt`
  ADD CONSTRAINT `fk_dni_dt` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`);

--
-- Constraints for table `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `fk_direccion_equipo` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`);

--
-- Constraints for table `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `fk_equipo` FOREIGN KEY (`cuit_equipo`) REFERENCES `equipo` (`cuit_equipo`),
  ADD CONSTRAINT `fk_jugador` FOREIGN KEY (`jugador_dni`) REFERENCES `jugador` (`dni`);

--
-- Constraints for table `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `fk_dni_jugador` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`);

--
-- Constraints for table `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_direccion_persona` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
