package com.wildcodeschool.quizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository <Question, Long> {

}
