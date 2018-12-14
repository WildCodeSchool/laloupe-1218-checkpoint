package com.wildcodeschool.quizz.myquizz.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answer {


	public Answer() {}
	
	public Answer(String answer, int question_id) {
		this.answer = answer;
		this.question_id = question_id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String answer;
	
	private int question_id;


	@ManyToOne
	@JoinColumn(name="question_id")
	@JsonIgnore
	private Question question;
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", question_id=" + question_id + "]";
	}
	
	public Long getId() {
		return id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
}
	
	
	
	
	