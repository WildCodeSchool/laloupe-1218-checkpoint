package com.wildcodeschool.quizz.myquizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entities.Answer;
import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.repositories.AnswerRepository;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionRepository;

@RestController
public class MyquizzController {
	@Autowired
	QuestionRepository questionRepo;
	
	@Autowired
	AnswerRepository answerRepo;
	
	@RequestMapping("/create")
	public Question createQuestion(String description) {
		Question question = new Question(description);
		return questionRepo.save(question);
	}
	
	@RequestMapping("/questions")
	public List<Question> getAllQuestion(){
		return questionRepo.findAll();
	}
	public List<Answer> getAllAnswer(){
		return answerRepo.findAll();
	}
	
}
