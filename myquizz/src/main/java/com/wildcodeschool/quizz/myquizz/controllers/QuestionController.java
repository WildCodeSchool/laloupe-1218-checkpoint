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
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepo;
	AnswerRepository answerRepo;
	
	@RequestMapping("/create/question")
	public Question createQuestion(String question) {
		Question question1 = new Question(question);
		return questionRepo.save(question1);
	}
	
	@RequestMapping("/create/answer")
	public Answer createAnswer(String answer, int question_id) {
		Answer answer1 = new Answer(answer, question_id);
		return answerRepo.save(answer1);
	}
	
	@RequestMapping("/read")
	public Question getQuestion(Long id) {
		return questionRepo.findById(id).get();
	}
	
	@RequestMapping("/readall")
	public List<Question> getAllQuestions(){
		return questionRepo.findAll();
	}
	
	

}
