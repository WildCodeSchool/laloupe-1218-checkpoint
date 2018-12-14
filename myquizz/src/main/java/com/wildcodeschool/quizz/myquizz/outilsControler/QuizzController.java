package com.wildcodeschool.quizz.myquizz.outilsControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.quizz.myquizz.entities.Answer;
import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.repositories.QuizzRepository;

@RestController
public class QuizzController {
	
	@Autowired
	QuizzRepository quizzRepo;
	
	@RequestMapping("/create")
	public Question createQuestion(String question) {
		Question question1 = new Question();
		return quizzRepo.save(question1);
	}
	
	@RequestMapping("/read")
	public Question getQuestion(Long questionId ) {
		return quizzRepo.findById(questionId).get();
	}
	
	@RequestMapping("/update")
	public Question updateQuestion(long questionId, String question) {
		Question questionToUpdate = quizzRepo.findById(questionId).get();
		if(question!=null) {
			questionToUpdate.setQuestion(question);
		}
		return quizzRepo.save(questionToUpdate);
	}
	
	@RequestMapping("/delete")
	public void deleteQuestion(Long questionId) {
		quizzRepo.deleteById(questionId);
	}
	
	@RequestMapping("/getByQuestion")
	public Question getQuestionByQuestion(String question) {
		return quizzRepo.findByQuestion(question);
	}
	
	@RequestMapping("/getByAnswer")
	public List<Answer> getAnswerByAnswer(String answerA, String answerB, String answerC) {
		return quizzRepo.findByAnswerContaining(answerA,answerB, answerC);
	}
}
