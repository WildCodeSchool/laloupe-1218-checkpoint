-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 14, 2018 at 11:02 AM
-- Server version: 5.7.24-0ubuntu0.18.04.1
-- PHP Version: 7.2.10-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizz`
--

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `id` bigint(20) NOT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `question_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`id`, `answer`, `question_id`) VALUES
(1, 'client', 1),
(2, 'serveur', 1),
(3, 'SGBDR', 1),
(4, 'ftp', 2),
(5, 'smtp', 2),
(6, 'http/https', 2),
(7, 'Java Persistence API', 3),
(8, 'Java Programmation API', 3),
(9, 'Java Performance API', 3),
(10, 'Java Database Connectivity', 4),
(11, 'Java Direct Connectivity', 4),
(12, 'Java Database Connection', 4),
(13, 'Object Relationnal Mapping', 5),
(14, 'Oriented Relationnal Mapping', 5),
(15, 'Organised Relationnal Mapping', 5),
(16, 'Hibernate est une implémentation de JDBC', 6),
(17, 'Hibernate est un ORM pour le langage Java', 6),
(18, 'Hibernate fournit un mapping entre les objets d\'une app Java et une base de données relationnelle', 6),
(19, 'JPA implémente Hibernate et EclipseLink', 7),
(20, 'Hibernate est une implémentation de JPA', 7),
(21, 'servlet.mappings', 8),
(22, 'web.xml', 8),
(23, 'servlet.xml', 8),
(24, 'servlet.config', 8),
(25, 'HttpServletResponse', 9),
(26, 'ServletRequest', 9),
(27, 'HttpParams', 9),
(28, 'java.servlet', 10),
(29, 'javax.servlet', 10),
(30, '.servlet', 10);

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `id` bigint(20) NOT NULL,
  `question` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`id`, `question`) VALUES
(1, 'Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet'),
(2, 'Lequel de ces protocoles est supporté par l\'objet HttpServlet ?'),
(3, 'JPA signifie:'),
(4, 'JDBC signifie:'),
(5, 'ORM signifie:'),
(6, 'Cochez les réponses correctes'),
(7, 'Laquelle de ces phrases est correcte'),
(8, 'Dans quel fichier définit-on un mapping de servlet ?'),
(9, 'Le serveur web qui exécute la servlet crée un objet _________ qu\'il passe à la méthode service() (i.e. doGet, doPost etc..)'),
(10, 'Toutes les servlets doivent implémenter l\'interface Servlet du package :');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3erw1a3t0r78st8ty27x6v3g1` (`question_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
