package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.entities.Answers;

@Repository
public interface AnswersRepository extends JpaRepository<Answers, Long>{

}
