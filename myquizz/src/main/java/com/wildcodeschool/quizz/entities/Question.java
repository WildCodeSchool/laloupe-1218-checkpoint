package com.wildcodeschool.quizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	public Question() {
	}
	
	public Question(String question) {
		this.question = question;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String question;
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}
	
	
	
	

	public Long getId() {
		return id;
	}


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	

}
