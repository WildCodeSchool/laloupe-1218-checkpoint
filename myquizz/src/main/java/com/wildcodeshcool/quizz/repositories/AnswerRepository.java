package com.wildcodeshcool.quizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeshool.quizz.entities.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
}
