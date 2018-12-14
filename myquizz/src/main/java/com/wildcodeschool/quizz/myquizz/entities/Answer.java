package com.wildcodeschool.quizz.myquizz.entities;

import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descritption;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId")
	private Question question;
	
//	Constructeur ##############################
	public Answer() {
		
	}
	public Answer( String description,  Question question) {
		this.descritption = description;
		this.question = question;
	}
	
//	Getter Setter #############################
	public String getDescritption() {
		return descritption;
	}

	public void setDescritption(String descritption) {
		this.descritption = descritption;
	}



}
