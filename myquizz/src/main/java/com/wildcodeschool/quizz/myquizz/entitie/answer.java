package com.wildcodeschool.quizz.myquizz.entitie;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class answer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int question_id;
	private String reponse;
	
	@ManyToOne
    @JoinColumn(name="question_id", nullable=false)
    private question Question;

	
	public answer() {
		
	}
	
	public answer(int questionId, String reponse) {
		this.question_id = questionId;
		this.reponse = reponse;		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
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
