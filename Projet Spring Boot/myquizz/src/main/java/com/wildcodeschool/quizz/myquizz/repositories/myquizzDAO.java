package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.entities.Reponse;


@Repository
public interface myquizzDAO extends JpaRepository<Question, Long> {
}