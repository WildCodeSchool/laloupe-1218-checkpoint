-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Client :  localhost:3306
-- Généré le :  Ven 14 Décembre 2018 à 10:02
-- Version du serveur :  5.7.24-0ubuntu0.18.04.1
-- Version de PHP :  7.2.10-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `quizz`
--

-- --------------------------------------------------------

--
-- Structure de la table `answar`
--

CREATE TABLE `answar` (
  `id` int(11) NOT NULL,
  `questionId` varchar(50) NOT NULL,
  `reponse` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `answar`
--

INSERT INTO `answar` (`id`, `questionId`, `reponse`) VALUES
(1, '1', 'A) client'),
(2, '1', 'B) serveur'),
(3, '1', 'C) SGBDR'),
(4, '2', 'A) ftp'),
(5, '2', 'B) smtp'),
(6, '2', 'C) http/https'),
(7, '3', 'A) Java Persistence API'),
(8, '3', 'B) Java Programmation API'),
(9, '3', 'C) Java Performance API'),
(10, '4', 'A) Java Database Connectivity'),
(11, '4', 'B) Java Direct Connectivity'),
(12, '4', 'C) Java Database Connection'),
(14, '5', 'A) Object Relationnal Mapping'),
(15, '5', 'B) Oriented Relationnal Mapping'),
(16, '5', 'C) Organised Relationnal Mapping'),
(17, '6', 'A) Hibernate est une implémentation de JDBC'),
(18, '6', 'B) Hibernate est un ORM pour le langage Java'),
(19, '6', 'C) Hibernate fournit un mapping entre les objets d\'une app Java et une base de données relationnelle'),
(20, '7', 'A) JPA implémente Hibernate et EclipseLink'),
(21, '7', 'B) Hibernate est une implémentation de JPA'),
(22, '8', 'A) servlet.mappings'),
(23, '8', 'B) web.xml'),
(24, '8', 'C) servlet.xml\r\n'),
(25, '8', 'D) servlet.config'),
(26, '9', 'A) HttpServletResponse'),
(27, '9', 'B) ServletRequest'),
(28, '9', 'C) HttpParams'),
(29, '10', 'A) java.servlet'),
(30, '10', 'B) javax.servlet'),
(31, '10', 'C) .servlet');

-- --------------------------------------------------------

--
-- Structure de la table `question`
--

CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `question` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `question`
--

INSERT INTO `question` (`id`, `question`) VALUES
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
-- Index pour les tables exportées
--

--
-- Index pour la table `answar`
--
ALTER TABLE `answar`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `answar`
--
ALTER TABLE `answar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT pour la table `question`
--
ALTER TABLE `question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
