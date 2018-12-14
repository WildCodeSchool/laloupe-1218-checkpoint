package com.wildcodeschool.quizz.myquizz.entities;

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


	public Question() {}
	
	public Question(String question) {
		this.question = question;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="question")
	private List<Answer> answers = new ArrayList<Answer>();
	
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
