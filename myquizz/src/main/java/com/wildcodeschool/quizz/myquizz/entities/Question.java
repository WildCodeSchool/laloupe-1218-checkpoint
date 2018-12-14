package com.wildcodeschool.quizz.myquizz.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	public Question() {
	}
	
	public Question(String questionText) {
		this.questionText = questionText;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String questionText;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="question")
    private Set<Awnser> awnsers;

	public Set<Awnser> getAwnsers() {
		return awnsers;
	}

	public void setAwnsers(Set<Awnser> awnsers) {
		this.awnsers = awnsers;
	}

	public Long getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	
}
