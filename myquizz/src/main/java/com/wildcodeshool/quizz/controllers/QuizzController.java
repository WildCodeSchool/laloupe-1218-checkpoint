package com.wildcodeshool.quizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeshcool.quizz.repositories.AnswerRepository;
import com.wildcodeshcool.quizz.repositories.QuestionRepository;
import com.wildcodeshool.quizz.entities.Question;

@RestController
public class QuizzController {

		@Autowired
		QuestionRepository questionRepo;
		
		@Autowired
		AnswerRepository answerRepo;
		
		@RequestMapping("/questions")
		public List<Question> showAll() {
		    return questionRepo.findAll();
		}
}
