package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.quizz.myquizz.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
