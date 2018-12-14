package com.wildcodeschool.quizz.myquizz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
