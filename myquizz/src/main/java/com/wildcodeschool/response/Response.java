package com.wildcodeschool.response;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wildcodeschool.questions.Question;

@Entity
@Table(name="checkpoint_response")
public class Response<Int> {
	
	
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false)
	private Question question;
	
	public Response() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String response;
	private Int question_id;
	
	public Response(String response, Int question_id) {
		this.question_id = question_id;
		this.response = response;
	}

	public Int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Int question_id) {
		this.question_id = question_id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
