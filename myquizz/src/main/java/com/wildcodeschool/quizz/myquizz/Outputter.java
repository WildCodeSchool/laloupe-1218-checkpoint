package com.wildcodeschool.quizz.myquizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Outputter implements CommandLineRunner{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public void run(String... args) throws Exception {
		
	Question question1 = new Question("Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet");
	questionRepository.save(question1);
	Question question2 = new Question("Lequel de ces protocoles est supporté par l'objet HttpServlet ?");
	questionRepository.save(question2);
	Question question3 = new Question("JPA signifie:");
	questionRepository.save(question2);
	Question question4 = new Question("JDBC signifie:");
	questionRepository.save(question2);
	Question question5 = new Question("ORM signifie:");
	questionRepository.save(question2);
	Question question6 = new Question("Cochez les réponses correctes");
	questionRepository.save(question2);
	Question question7 = new Question("Laquelle de ces phrases est correcte");
	questionRepository.save(question2);
	Question question8 = new Question("Dans quel fichier définit-on un mapping de servlet ?");
	questionRepository.save(question2);
	Question question9 = new Question("Le serveur web qui exécute la servlet crée un objet _________ qu'il passe à la méthode service() (i.e. doGet, doPost etc..)");
	questionRepository.save(question2);
	Question question10 = new Question("Toutes les servlets doivent implémenter l'interface Servlet du package :");
	questionRepository.save(question2);
	
	String[] array1Answer = {"A) client","B) serveur","C) SGBDR"};
	Answer answer1 = new Answer(array1Answer);
	answerRepository.save(answer1);
	
	String[] array2Answer = {"A) ftp","B) smtp","C) http/https"};
	Answer answer2 = new Answer(array2Answer);
	answerRepository.save(answer2);
	
	String[] array3Answer = {"A) Java Persistence API","B) Java Programmation API","C) Java Performance API"};
	Answer answer3 = new Answer(array3Answer);
	answerRepository.save(answer3);
	
	String[] array4Answer = {"A) Java Database Connectivity","B) Java Direct Connectivity","C) Java Database Connection"};
	Answer answer4 = new Answer(array4Answer);
	answerRepository.save(answer4);
	
	String[] array5Answer = {" Object Relationnal Mapping","B) Oriented Relationnal Mapping","C) Organised Relationnal Mapping"};
	Answer answer5 = new Answer(array5Answer);
	answerRepository.save(answer5);
	
	String[] array6Answer = {"A) Hibernate est une implémentation de JDBC","B) Hibernate est un ORM pour le langage Java","C) Hibernate fournit un mapping entre les objets d'une app Java et une base de données relationnelle"};
	Answer answer6 = new Answer(array6Answer);
	answerRepository.save(answer6);
	
	String[] array7Answer = {"A) JPA implémente Hibernate et EclipseLink","B) Hibernate est une implémentation de JPA"};
	Answer answer7 = new Answer(array7Answer);
	answerRepository.save(answer7);
	
	String[] array8Answer = {"A) servlet.mappings","B) web.xml","C) servlet.xml","D servlet.config"};
	Answer answer8 = new Answer(array8Answer);
	answerRepository.save(answer8);
	
	String[] array9Answer = {"A) HttpServletResponse","B) ServletRequest","C) HttpParams"};
	Answer answer9 = new Answer(array9Answer);
	answerRepository.save(answer9);
	
	String[] array10Answer = {"A) java.servlet","B) javax.servlet","C) .servlet"};
	Answer answer10 = new Answer(array10Answer);
	answerRepository.save(answer10);
	
	}
	
	
}
