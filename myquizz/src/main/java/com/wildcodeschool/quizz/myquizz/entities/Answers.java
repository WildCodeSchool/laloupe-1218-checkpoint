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
@Table(name="answers")
public class Answers {
	
//	@ManyToOne
//	@JoinColumn(name="question_id")
//	@JsonIgnore
//	private Questions question;

	public Answers() {
		
	}
	
	public Answers(String answer, int question_id) {
		this.answer = answer;
		this.question_id = question_id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String answer;
	
	private int question_id;

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

//	public Questions getQuestion() {
//		return question;
//	}
//
//	public void setQuestion(Questions question) {
//		this.question = question;
//	}

	public void setId(Long id) {
		this.id = id;
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
