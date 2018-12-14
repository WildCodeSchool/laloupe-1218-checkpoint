package com.wildcodeschool.quizz.myquizz.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.quizz.myquizz.entities.Questions;
import com.wildcodeschool.quizz.myquizz.entities.Answers;
import com.wildcodeschool.quizz.myquizz.repositories.AnswersRepository;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionsRepository;

@Component
public class Outputter implements CommandLineRunner{
	
	private Logger LOG = LoggerFactory.getLogger("wilder");
	
	@Autowired
	private QuestionsRepository questionsRepository;
	
	@Autowired
	private AnswersRepository answersRepository;
	
	

	@Override
	public void run(String... args) throws Exception{
		// Check objects in DB
		LOG.info("**********");
		LOG.info("Objects in Questions : " + questionsRepository.count());
		LOG.info("Objects in Questions : " + answersRepository.count());
		
		// Create questions
		Questions question1 = new Questions("Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet");
		questionsRepository.save(question1);
		Questions question2 = new Questions("Lequel de ces protocoles est supporté par l'objet HttpServlet ?");
		questionsRepository.save(question2);
		Questions question3 = new Questions("JPA signifie:");
		questionsRepository.save(question3);
		Questions question4 = new Questions("JDBC signifie:");
		questionsRepository.save(question4);
		Questions question5 = new Questions("ORM signifie:");
		questionsRepository.save(question5);
		Questions question6 = new Questions("Cochez les réponses correctes");
		questionsRepository.save(question6);
		Questions question7 = new Questions("Laquelle de ces phrases est correcte");
		questionsRepository.save(question7);
		Questions question8 = new Questions("Dans quel fichier définit-on un mapping de servlet ?");
		questionsRepository.save(question8);
		Questions question9 = new Questions("Le serveur web qui exécute la servlet crée un objet _________ qu'il passe à la méthode service() (i.e. doGet, doPost etc..)");
		questionsRepository.save(question9);
		Questions question10 = new Questions("Toutes les servlets doivent implémenter l'interface Servlet du package :");
		questionsRepository.save(question10);
		
		// Create answers
		Answers answer1 = new Answers("A) client",1);
		answersRepository.save(answer1);
		Answers answer2 = new Answers("B) serveur",1);
		answersRepository.save(answer2);
		Answers answer3 = new Answers("C) SGBDR",1);
		answersRepository.save(answer3);
		Answers answer4 = new Answers("A) ftp",2);
		answersRepository.save(answer4);
		Answers answer5 = new Answers("B) smtp",2);
		answersRepository.save(answer5);
		Answers answer6 = new Answers("C) http/https",2);
		answersRepository.save(answer6);
		Answers answer7 = new Answers("A) Java Persistence API",3);
		answersRepository.save(answer7);
		Answers answer8 = new Answers("B) Java Programmation API",3);
		answersRepository.save(answer8);
		Answers answer9 = new Answers("B) Java Performance API",3);
		answersRepository.save(answer9);
		Answers answer10 = new Answers("A) Java Database Connectivity",4);
		answersRepository.save(answer10);
		Answers answer11 = new Answers("Java Direct Connectivity",4);
		answersRepository.save(answer11);
		Answers answer12 = new Answers("Java Database Connection",4);
		answersRepository.save(answer12);
		Answers answer13 = new Answers("A) Object Relationnal Mapping",5);
		answersRepository.save(answer13);
		Answers answer14 = new Answers("B) Oriented Relationnal Mapping",5);
		answersRepository.save(answer14);
		Answers answer15 = new Answers("C) Organised Relationnal Mapping",5);
		answersRepository.save(answer15);
		Answers answer16 = new Answers("A) Hibernate est une implémentation de JDBC",6);
		answersRepository.save(answer16);
		Answers answer17 = new Answers("B) Hibernate est un ORM pour le langage Java",6);
		answersRepository.save(answer17);
		Answers answer18 = new Answers("C) Hibernate fournit un mapping entre les objets d'une app Java et une base de données relationnelle",6);
		answersRepository.save(answer18);
		Answers answer19 = new Answers("A) JPA implémente Hibernate et EclipseLink",7);
		answersRepository.save(answer19);
		Answers answer20 = new Answers("B) Hibernate est une implémentation de JPA",7);
		answersRepository.save(answer20);
		Answers answer21 = new Answers("A) servlet.mappings",8);
		answersRepository.save(answer21);
		Answers answer22 = new Answers("B) web.xml",8);
		answersRepository.save(answer22);
		Answers answer23 = new Answers("C) servlet.xml",8);
		answersRepository.save(answer23);
		Answers answer24 = new Answers("D servlet.config",8);
		answersRepository.save(answer24);
		Answers answer25 = new Answers("A) HttpServletResponse",9);
		answersRepository.save(answer25);
		Answers answer26 = new Answers("B) ServletRequest",9);
		answersRepository.save(answer26);
		Answers answer27 = new Answers("C) HttpParams",9);
		answersRepository.save(answer27);
		Answers answer28 = new Answers("A) java.servlet",10);
		answersRepository.save(answer28);
		Answers answer29 = new Answers("B) javax.servlet",10);
		answersRepository.save(answer29);
		Answers answer30 = new Answers("C) .servlet",10);
		answersRepository.save(answer30);
	}
}
