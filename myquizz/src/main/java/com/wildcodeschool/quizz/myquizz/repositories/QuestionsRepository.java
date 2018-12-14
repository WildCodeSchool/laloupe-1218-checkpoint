package com.wildcodeschool.quizz.myquizz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.quizz.myquizz.entities.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long>{

}
