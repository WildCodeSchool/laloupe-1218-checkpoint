package com.wildcodeschool.quizz.myquizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Answers")
public class Answer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String answer;
	
	
	@ManyToOne
	@JoinColumn(name = "questionId")
	@JsonIgnore
	private Questions question;
	
	public Answer(String answer) {
		this.answer = answer;
		
	}
	

	public Questions getQuestion() {
		return question;
	}


	public void setQuestion(Questions question) {
		this.question = question;
	}


	public Answer() {
		
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
}

