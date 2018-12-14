package com.wildcodeschool.quizz.myquizz.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.quizz.myquizz.entitie.question;

@Repository
public interface myQuizzRepository extends JpaRepository<question, Long> {
	
//	public question findByquestion (String question);
	List<question> findByquesion(String question);

}
