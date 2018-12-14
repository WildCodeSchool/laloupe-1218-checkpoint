package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.entitie.answer;

@Repository
public interface myQuizzRepositoryAnswer extends JpaRepository<answer, Long>{

}
