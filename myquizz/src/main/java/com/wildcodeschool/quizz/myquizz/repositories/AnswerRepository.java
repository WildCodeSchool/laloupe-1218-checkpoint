package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.entities.Answer;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
	
}
