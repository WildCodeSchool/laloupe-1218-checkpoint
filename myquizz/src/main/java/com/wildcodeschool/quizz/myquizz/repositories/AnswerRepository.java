package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.quizz.myquizz.entities.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long>{

}
