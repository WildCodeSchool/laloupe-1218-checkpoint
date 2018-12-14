package com.wildcodeshool.quizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answer {
	
	public Answer() {
	}
	
	public Answer(int questionId, String answerNb, String answer) {
		this.questionId = questionId;
		this.answerNb = answerNb;
		this.answer = answer;
	}
	
	@ManyToOne
	@JoinColumn(name = "questionId")
	@JsonIgnore
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int questionId;
	private String answerNb;
	private String answer;
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswerNb() {
		return answerNb;
	}

	public void setAnswerNb(String answerNb) {
		this.answerNb = answerNb;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	
}
