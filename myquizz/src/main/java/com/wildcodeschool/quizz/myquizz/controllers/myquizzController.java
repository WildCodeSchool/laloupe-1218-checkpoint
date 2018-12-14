package com.wildcodeschool.quizz.myquizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entitie.answer;
import com.wildcodeschool.quizz.myquizz.entitie.question;
import com.wildcodeschool.quizz.myquizz.repositories.myQuizzRepository;
import com.wildcodeschool.quizz.myquizz.repositories.myQuizzRepositoryAnswer;




@RestController
public class myquizzController {
	
	@Autowired
	myQuizzRepository myQuizzQue;
	
	@Autowired
	myQuizzRepositoryAnswer myQuizzAns;

	
	// lire dans la table 
		@RequestMapping("/questions")
		public List<question> getAll() {
			return myQuizzQue.findAll();
		}
		
		

		
}
