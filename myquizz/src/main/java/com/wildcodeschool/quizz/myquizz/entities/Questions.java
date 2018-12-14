package com.wildcodeschool.quizz.myquizz.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions {

	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, mappedBy="question_id")
	private List<Answers> answer = new ArrayList<Answers>();
	
	
	public Questions() {
		
	}
	
	public Questions(String question) {
		this.question = question;
	}
	
//	public List<Answers> getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(List<Answers> answer) {
//		this.answer = answer;
//	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Answers> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}

}
