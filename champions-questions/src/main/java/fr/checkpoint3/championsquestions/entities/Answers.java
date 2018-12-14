package fr.checkpoint3.championsquestions.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "answers")
public class Answers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private  String response_1;
	private  String response_2;
	private  String response_3;
	private  String response_4;
	private int epreuve_id;
	
	
	
	public Answers(String response_1, String response_2, String response_3, String response_4, int epreuve_id) {
		this.response_1 = response_1;
		this.response_2 = response_2;
		this.response_3 = response_3;
		this.response_4 = response_4;
		this.epreuve_id = epreuve_id;
	}

	@ManyToOne(optional = false ) 
	@JoinColumn(name = "epreuve_id", referencedColumnName = "epreuve_id", insertable=false, updatable=false)
	@JsonIgnore
	private Question question;
	public Question getEpreuve_id() {
		return question;
	}
	
	public Answers() {
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponse_1() {
		return response_1;
	}

	public void setResponse_1(String response_1) {
		this.response_1 = response_1;
	}

	public String getResponse_2() {
		return response_2;
	}

	public void setResponse_2(String response_2) {
		this.response_2 = response_2;
	}

	public String getResponse_3() {
		return response_3;
	}

	public void setResponse_3(String response_3) {
		this.response_3 = response_3;
	}

	public String getResponse_4() {
		return response_4;
	}

	public void setResponse_4(String response_4) {
		this.response_4 = response_4;
	}


	public int getResponse_id() {
		return epreuve_id;
	}


	public void setResponse_id(int epreuve_id) {
		this.epreuve_id = epreuve_id;
	}
	
	

}
