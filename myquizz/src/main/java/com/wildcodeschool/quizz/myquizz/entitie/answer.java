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
public class answer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String reponse;
	

	@ManyToOne
    @JoinColumn(name="question_id", nullable=false)
    private question Question;

	
	public answer() {
		
	}
	
	public answer( String reponse) {
		
		this.reponse = reponse;		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public question getQuestion() {
	return Question;
	}
	
	public void setQuestion(question question) {
		Question = question;
	}



	

}
