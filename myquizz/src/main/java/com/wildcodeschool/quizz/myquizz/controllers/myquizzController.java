package com.wildcodeschool.quizz.myquizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.wildcodeschool.quizz.myquizz.entitie.question;
import com.wildcodeschool.quizz.myquizz.repositories.myQuizzRepository;




@RestController
public class myquizzController {
	
	@Autowired
	myQuizzRepository myQuizzQue;

	
	// lire dans la table 
		@RequestMapping("/questions")
		public List<question> getAllQuestion() {
			return myQuizzQue.findAll();
			}

		
}
