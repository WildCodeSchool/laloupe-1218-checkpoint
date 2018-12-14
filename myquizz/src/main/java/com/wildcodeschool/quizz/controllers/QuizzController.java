package com.wildcodeschool.quizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.entities.Question;
import com.wildcodeschool.quizz.repositories.QuestionRepository;

@RestController
public class QuizzController {

		@Autowired
		private QuestionRepository questionRepo;
		
		public QuizzController() {
			
		}
		
		@RequestMapping("/questions")
		public List<Question> getAll() {
		    return this.questionRepo.findAll();
		}

}
