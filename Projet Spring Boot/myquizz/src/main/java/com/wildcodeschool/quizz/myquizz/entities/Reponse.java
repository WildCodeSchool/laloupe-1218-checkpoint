package com.wildcodeschool.quizz.myquizz.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Reponse")
public class Reponse {
	
	public Reponse() {
	}
	
	public Reponse(Long id, String Reponse) {
        this.id = id;
        this.Reponse = Reponse;
    }

	@ManyToOne
	@JoinColumn(name="Reponse_id", nullable=false)
	public Question Question;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id; 

	 private String Reponse;
	 
	@Override
    public String toString() { 
        return "Reponse [id=" + id + ", Reponse=" + Reponse + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReponse() {
		return Reponse;
	}

	public void setReponse(String reponse) {
		Reponse = reponse;
	}

	/* Getters et Setters*/
	                 
	 
	 
	 
}


