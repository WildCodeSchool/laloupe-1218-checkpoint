package com.wildcodeschool.quizz.myquizz.utils;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wildcodeschool.quizz.myquizz.entities.Awnser;
import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.repositories.AwnserDao;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionDao;

@Component
public class Outputter implements CommandLineRunner {

	@Autowired
	private QuestionDao questionDao;

	@Autowired
	private AwnserDao awnserDao;

	public void run(String... args) throws Exception {

		deleteData();
		saveData();
		showData();

	}

	public void deleteData() {
		questionDao.deleteAll();
		awnserDao.deleteAll();
	}

	public void saveData() {
		Question question1 = new Question(
				"Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet");
		Awnser awnser11 = new Awnser("A) client", question1);
		Awnser awnser12 = new Awnser("B) serveur", question1);
		Awnser awnser13 = new Awnser("C) SGBDR", question1);
		question1.setAwnsers(new HashSet<Awnser>() {
			{
				add(awnser11);
				add(awnser12);
				add(awnser13);
			}
		});
		questionDao.save(question1);
		Question question2 = new Question("Lequel de ces protocoles est supporté par l'objet HttpServlet ?");
		Awnser awnser21 = new Awnser("A) ftp", question2);
		Awnser awnser22 = new Awnser("B) smtp", question2);
		Awnser awnser23 = new Awnser("C) http/https", question2);
		question2.setAwnsers(new HashSet<Awnser>() {
			{
				add(awnser21);
				add(awnser22);
				add(awnser23);
			}
		});
		questionDao.save(question2);
		Question question3 = new Question("JPA signifie:");
		questionDao.save(question3);
		Question question4 = new Question("JDBC signifie:");
		questionDao.save(question4);
		Question question5 = new Question("ORM signifie:");
		questionDao.save(question5);
		Question question6 = new Question("Cochez les réponses correctes");
		questionDao.save(question6);
		Question question7 = new Question("Laquelle de ces phrases est correcte");
		questionDao.save(question7);
		Question question8 = new Question("Dans quel fichier définit-on un mapping de servlet ?");
		questionDao.save(question8);
		Question question9 = new Question(
				"Le serveur web qui exécute la servlet crée un objet _________ qu'il passe à la méthode service() (i.e. doGet, doPost etc..)");
		questionDao.save(question9);
		Question question10 = new Question("Toutes les servlets doivent implémenter l'interface Servlet du package :");
		questionDao.save(question10);
	}

	public void showData() {
		List<Question> questionList = questionDao.findAll();
		List<Awnser> awnserList = awnserDao.findAll();

		System.out.println("*********************Awnser List :*********************");
		awnserList.forEach(System.out::println);

		System.out.println("*********************Question List :*********************");
		questionList.forEach(System.out::println);
	}

	@RequestMapping(value = "/questions")
	public String displayData() {
		return "" + questionDao.findAll();
	}
}
