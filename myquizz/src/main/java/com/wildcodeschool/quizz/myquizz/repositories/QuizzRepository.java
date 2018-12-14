package com.wildcodeschool.quizz.myquizz.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.entities.Answer;
import com.wildcodeschool.quizz.myquizz.entities.Question;

@Repository
public interface QuizzRepository extends JpaRepository<Question, Long> {

	Question save(String question);
	
	public Question findByQuestion(String question);
	List<Answer> findByAnswerContaining(String answer, String answerB, String answerC);

}

