package com.wildcodeschool.quizz.myquizz.entitie;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class question {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long question_id;
	
	private String question;
	

	
	@OneToMany(mappedBy="id")
	private Set<answer> answer ;
	
	public question() {
		
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<answer> getAnswer() {
		return answer;
	}

	public void setAnswer(Set<answer> answer) {
		this.answer = answer;
	}

	
	
}	

	