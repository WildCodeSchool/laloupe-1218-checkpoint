-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Client :  localhost:3306
-- Généré le :  Ven 14 Décembre 2018 à 13:39
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
-- Structure de la table `answer`
--

CREATE TABLE `answer` (
  `id` int(11) NOT NULL,
  `answer` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `answer`
--

INSERT INTO `answer` (`id`, `answer`) VALUES
(1, 'A) client\r\nB) serveur\r\nC) SGBDR'),
(2, 'A) ftp\r\nB) smtp\r\nC) http/https'),
(3, 'A) Java Persistence API\r\nB) Java Programmation API\r\nC) Java Performance API'),
(4, 'A) Java Database Connectivity\r\nB) Java Direct Connectivity\r\nC) Java Database Connection'),
(5, 'A) Object Relationnal Mapping\r\nB) Oriented Relationnal Mapping\r\nC) Organised Relationnal Mapping'),
(6, 'A) Hibernate est une implémentation de JDBC\r\nB) Hibernate est un ORM pour le langage Java\r\nC) Hibernate fournit un mapping entre les objets d\'une app Java et une base de données relationnelle'),
(7, 'A) JPA implémente Hibernate et EclipseLink\r\nB) Hibernate est une implémentation de JPA'),
(8, 'A) servlet.mappings\r\nB) web.xml\r\nC) servlet.xml\r\nD servlet.config'),
(9, 'A) HttpServletResponse\r\nB) ServletRequest\r\nC) HttpParams'),
(10, 'A) java.servlet\r\nB) javax.servlet\r\nC) .servlet');

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
(4, 'JDBC signifie'),
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
-- Index pour la table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `question`
--
ALTER TABLE `question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
