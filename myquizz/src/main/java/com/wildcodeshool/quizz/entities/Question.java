package com.wildcodeshool.quizz.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Question {
	
	public Question() {
	}
	
	public Question(int questionNb, String question) {
		this.questionNb = questionNb;
		this.question = question;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="questions")
    private List<Answer> answers = new ArrayList<Answer>();
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	private int questionNb;
	private String question;
	
	public int getQuestionNb() {
		return questionNb;
	}
	public void setQuestionNb(int questionNb) {
		this.questionNb = questionNb;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
}
