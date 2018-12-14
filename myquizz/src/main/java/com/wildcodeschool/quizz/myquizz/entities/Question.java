package com.wildcodeschool.quizz.myquizz.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<Answer> Answer;
	
	private String descritption;
	
//	Constructeur ##############################
	public Question() {
		
	}
	public Question( String description) {
		this.descritption = description;
	}
	
//	Getter Setter #############################
	public String getDescritption() {
		return descritption;
	}

	public void setDescritption(String descritption) {
		this.descritption = descritption;
	}
	
}
