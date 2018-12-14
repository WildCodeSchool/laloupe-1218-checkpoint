package com.wildcodeschool.quizz.myquizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="awnser")
public class Awnser {
	
	public Awnser() {
	}
	
	public Awnser(String awnserText, Question question) {
		this.awnsertext = awnserText;
		this.question = question;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String awnsertext;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;

	public Long getId() {
		return id;
	}

	public String getAwnsertext() {
		return awnsertext;
	}

	public void setAwnsertext(String awnsertext) {
		this.awnsertext = awnsertext;
	}

}
