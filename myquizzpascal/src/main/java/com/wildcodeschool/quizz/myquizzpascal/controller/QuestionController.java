package com.wildcodeschool.quizz.myquizzpascal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizzpascal.entities.Question;
import com.wildcodeschool.quizz.myquizzpascal.repositories.QuestionRepository;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepo;
	
	@RequestMapping("/create")
	public Question createQuestion(String questions) {
		Question quizz = new Question("Salutation");
		return questionRepo.save(quizz);
	}
	@RequestMapping("/read")
	public Question getQuestion(Long quizzId) {
		return questionRepo.findById(quizzId).get();
	}
	@RequestMapping("/readall")
	public List<Question> getAllQuestions(){
		return questionRepo.findAll();
	}
	
}