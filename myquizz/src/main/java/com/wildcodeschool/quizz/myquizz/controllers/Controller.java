package com.wildcodeschool.quizz.myquizz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entities.Answer;
import com.wildcodeschool.quizz.myquizz.entities.Questions;
import com.wildcodeschool.quizz.myquizz.repositories.AnswerRepo;
import com.wildcodeschool.quizz.myquizz.repositories.QuizzRepo;



@RestController
public class Controller {

	@Autowired
	QuizzRepo quizzRepo;
	
	@Autowired
	AnswerRepo answerRepo;
	
	
	
	@RequestMapping("/questions/createquestion")
	public Questions createQuestion(String question) {
		Questions quiz = new Questions(question);
		return quizzRepo.save(quiz);
	}
	
	@RequestMapping("/questions/createanswer")
	public Questions createAnswer(Long questionId, String answer) {
		Questions question = quizzRepo.findById(questionId).get();
		Answer réponse = new Answer(answer);
		List<Answer> answers = question.getAnswers();
		answers.add(réponse);
		réponse.setQuestion(question);
		return quizzRepo.save(question);
	}
	
	@RequestMapping("/questions/update")
	public Questions updateQuestions(Long questionId, String question) {
		Questions quizToUpdate = quizzRepo.findById(questionId).get();
		
		if(question != null) {
			quizToUpdate.setQuestion(question);
		}
		return quizzRepo.save(quizToUpdate);
	}
	
	@RequestMapping("/questions/read")
	public Questions getQuiz(Long questionId) {
		return quizzRepo.findById(questionId).get();
	}
	
	@RequestMapping("/questions")
	public List<Questions> getAllQuestions(){
		return quizzRepo.findAll();
	}
	
	@RequestMapping("/questions/delete")
	public void deleteQuestion(Long questionId) {
		quizzRepo.deleteById(questionId);
	}
	
}
