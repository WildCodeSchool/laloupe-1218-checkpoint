package com.wildcodeschool.quizz.entities;

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
	
	public Question(String question) {
		this.setQuestion(question);
	}
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="questionId")
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

	private String question;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getId() {
		return id;
	}
	
}
