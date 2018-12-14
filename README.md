  
# Checkpoint Java, Spring & Hibernate 

Dans ce checkpoint, on va valider les compétences web que tu as acquises au cours du dernier mois.

## Objectifs
- Générer un projet web utilisant spring & hibernate 
- Mettre en relation des entités 
- Tester ses connaissances théoriques 


Commence par cloner ce repo, et crée ta branche Java-1228-[ville]-[prenom]-[nom] (ex: Java-1218-Lyon-John-Smith) dans laquelle tu pusheras tes réponses. Crée un fichier reponses.txt dans lequel tu noteras tes réponses (attention certaines questions peuvent avoir plusieurs réponses)  en respectant la forme suivante: 

1) A,C
2) B,A
... etc ...

# Questionnaire

  

#### Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet

- A) client
- B) serveur
- C) SGBDR

#### Lequel de ces protocoles est supporté par l'objet HttpServlet ?

- A) ftp
- B) smtp
- C) http/https

#### JPA signifie:

- A) Java Persistence API
- B) Java Programmation API
- C) Java Performance API

  

#### JDBC signifie:

- A) Java Database Connectivity
- B) Java Direct Connectivity
- C) Java Database Connection

#### ORM signifie:

- A) Object Relationnal Mapping
- B) Oriented Relationnal Mapping
- C) Organised Relationnal Mapping

  

#### Cochez les réponses correctes

- A) Hibernate est une implémentation de JDBC
- B) Hibernate est un ORM pour le langage Java
- C) Hibernate fournit un mapping entre les objets d'une app Java et une base de données relationnelle

#### Laquelle de ces phrases est correcte

- A) JPA implémente Hibernate et EclipseLink
- B) Hibernate est une implémentation de JPA

#### Dans quel fichier définit-on un mapping de servlet ?

- A) servlet.mappings
- B) web.xml
- C) servlet.xml
- D servlet.config

  

#### Le serveur web qui exécute la servlet crée un objet _________ qu'il passe à la méthode service() (i.e. doGet, doPost etc..)

- A) HttpServletResponse
- B) ServletRequest
- C) HttpParams

  

#### Toutes les servlets doivent implémenter l'interface Servlet du package :

- A) java.servlet
- B) javax.servlet
- C) .servlet

  
  

# Challenge

  

## Initialisation

  

##### 1. Créer un projet Spring Boot

  

À partir de [Spring Initializr](https://start.spring.io/), crée un nouveau projet avec :

- group : `com.wildcodeschool.quizz`

- Artifact : `myquizz`

- dependencies : `Web` (comporte toute la configuration de départ nécessaire pour un projet web), `JPA` (correspond à *Spring Data JPA*, que nous allons utiliser) et `MySQL`(c'est le driver *MySQL JDBC*).

  

![Illus1](http://images.innoveduc.fr/java/spring_hibernate/1.png)

  

Télecharge le projet généré, dézippe-le et importe-le dans Eclipse.

  
  

##### 2. Créer la BDD

Pour créer la BDD que nous allons utiliser, tape dans ton terminal :

~~~bash

-- Crée une nouvelle BDD

mysql> CREATE DATABASE quizz;

  
-- Crée un nouvel utilisateur (tu peux bien sûr remplacer jpfoucault)

mysql> CREATE USER 'jpfoucault'@'localhost' IDENTIFIED BY 'jpfoucault';

  
-- Attribue à l`utilisateur tous les privilèges pour la BDD créée

mysql> GRANT ALL ON quizz.* TO 'jpfoucault'@'localhost';

~~~

Tu peux vérifier que la BDD a bien été créée via ton client SQL préféré (*phpMyAdmin* ou *MySQL Workbench*, par exemple).

  

##### 3. Configurer la liaison entre Spring et la BDD

  

Dans `src/main/resources`, trouve le fichier `application.properties`. Celui-ci est vide pour l'instant. Remplissons-le !

  

~~~bash

## Informations sur la BDD à exploiter

spring.datasource.url = jdbc:mysql://localhost:3306/quizz
spring.datasource.username = jpfoucault
spring.datasource.password = jpfoucault

## Autoriser l'affichage des requêtes SQL faites par Hibernate

spring.jpa.show-sql=true

  

## Gérer Hibernate

spring.jpa.hibernate.ddl-auto = update

~~~

  
  

## Exercice

Créer une application Spring & Hibernate ayant pour fonctionnalité de retourner un jeu de données représentant des questions et les réponses associées à chacune de ces questions. L'application devra respecter les critères suivants: 

- L'URL nous permettant d'interroger l'application doit respecter la forme suivante: "http://localhost:8080/questions".  
- Le verbe HTTP utilisé est le verbe GET
- Les données doivent être retournées au format JSON
- L'application devra comporter une entité **Question** ainsi qu'une entité **Answer**, une question peut être associée à une ou plusieurs réponses.  
- Les questions et les réponses  devront correspondre à celle du questionnaire du début de checkpoint. 

##### Resources 

Pour relier les 2 entités citées plus haut, cherche du côté des annotations fournies par Hibernate, plus exactement **@OneToMany** et **@ManyToOne**. 

- Dans un premier temps tu connais la chanson: [RTFM](https://docs.jboss.org/hibernate/jpa/2.1/api/javax/persistence/OneToMany.html)
- Un exemple simple avec un panier et des produits [ici](https://www.baeldung.com/hibernate-one-to-many)

Attention à ne pas te lancer dans un copier/coller , le tutoriel est assez proche de ce que l'on te demande mais tu devras l'adapter ! 
Une fois le projet terminé, push le code de ton application. 
