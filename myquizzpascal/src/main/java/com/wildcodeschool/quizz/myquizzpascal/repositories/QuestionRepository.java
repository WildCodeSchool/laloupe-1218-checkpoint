package com.wildcodeschool.quizz.myquizzpascal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizzpascal.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
