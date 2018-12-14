package com.wildcodeschool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.questions.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
