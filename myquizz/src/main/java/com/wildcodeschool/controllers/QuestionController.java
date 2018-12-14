package com.wildcodeschool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.questions.Question;
import com.wildcodeschool.repositories.QuestionRepository;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepo;
	
	@RequestMapping("/read")
	public Question getQuestion(Long question_id) {
		return questionRepo.findById(question_id).get();
	}
	
	@RequestMapping("/readall")
	public List<Question> getAllQuestion(){
		return questionRepo.findAll();
	}
	

}
