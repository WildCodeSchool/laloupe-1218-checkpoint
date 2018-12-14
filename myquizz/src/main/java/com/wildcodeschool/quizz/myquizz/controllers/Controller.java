package com.wildcodeschool.quizz.myquizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entities.Answers;
import com.wildcodeschool.quizz.myquizz.entities.Questions;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionsRepository;
import com.wildcodeschool.quizz.myquizz.repositories.AnswersRepository;

@RestController
public class Controller {

	@Autowired
	QuestionsRepository questionRepository;
	
	@Autowired
	AnswersRepository answersRepository;
	
	@RequestMapping("/questions")
	public List<Questions> getAllQuestions(){
		return questionRepository.findAll();
	}
	
	@RequestMapping("/answers")
	public List<Answers> getAllAnswers(){
		return answersRepository.findAll();
	}
}
