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
public class Quizz {
	
	@Autowired
	QuestionRepository questionRepo;
	
	@Autowired
	AnswerRepository answerRepo;
	
	@RequestMapping("/questions")
	public List<Question> getAllServices() {
		return questionRepo.findAll();
	}
	
	@RequestMapping("/add/question")
	public Question addQuestion(String text) {
		Question created = new Question(text);
		return questionRepo.save(created);
	}
	
	@RequestMapping("/add/answer")
	public Question addAnswer(Long id, String text) {
		Question question = questionRepo.findById(id).get();
		List<Answer> answers = question.getAnswers();
		Answer created = new Answer(text);
		
		created.setQuestion(question);
		answers.add(created);
		
		return questionRepo.save(question);
	}
	
	
}
