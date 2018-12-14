package com.wildcodeschool.quizz.myquizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entities.Answer;
import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.repositories.AnswerRepository;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionRepository;


@RestController
public class QuizzController {
	
	@Autowired
	QuestionRepository questionRepo;
	AnswerRepository answerRepo;
	
	@RequestMapping("/readall")
	public List<Question>getQuestion(){
		return questionRepo.findAll();
	}
	public List<Answer>getAnswer(){
		return answerRepo.findAll();
	}

}
