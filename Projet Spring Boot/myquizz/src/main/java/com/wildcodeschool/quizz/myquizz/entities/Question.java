package com.wildcodeschool.quizz.myquizz.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
	
	public Question() {
	}
	
	public Question(Long id, String Question) {
        this.id = id;
        this.Question = Question;
    }

	@OneToMany(mappedBy="Question")
	private Set<Reponse> Reponse;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id; 

	 private String Question;
	 
	@Override
    public String toString() { 
        return "Question [id=" + id + ", Question=" + Question + "]";
    }

	/* Getters et Setters*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}                    
	 
	 
	 
}


