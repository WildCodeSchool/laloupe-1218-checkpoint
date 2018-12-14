package fr.checkpoint3.championsquestions.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String epreuve;
	private int epreuve_id;
	
	public Question() {
		
	}
	
	public Question(String epreuve, int epreuve_id) {
		this.epreuve = epreuve;
		this.epreuve_id = epreuve_id;
	}
    
	@JsonIgnore
	@OneToMany( cascade = CascadeType.ALL, mappedBy="epreuve_id")
	public List<Answers> answers = new ArrayList<Answers>(); 
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(String epreuve) {
		this.epreuve = epreuve;
	}

	public int getEpreuve_id() {
		return epreuve_id;
	}

	public void setEpreuve_id(int epreuve_id) {
		this.epreuve_id = epreuve_id;
	}

	
}
