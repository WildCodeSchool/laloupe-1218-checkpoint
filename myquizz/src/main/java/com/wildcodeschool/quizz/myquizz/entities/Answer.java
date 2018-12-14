package com.wildcodeschool.quizz.myquizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table")
public class Answer {

	public Answer () {}
		public Answer(String answer) {
		this.answer = answer;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	private String answer;
	
	@Override
	public String toString() {
		return "Answer = "+answer;
	}
	
}
