package com.wildcodeschool.quizz.myquizz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String answerA;
		private String answerB;
		private String answerC;
		
		public Answer() {
		}
		
		public Answer(String answerA, String answerB, String answerC) {
			this.answerA = answerA;
			this.answerB = answerB;
			this.answerC = answerC;
		}

		public String getAnswerA() {
			return answerA;
		}

		public void setAnswerA(String answerA) {
			this.answerA = answerA;
		}

		public String getAnswerB() {
			return answerB;
		}

		public void setAnswerB(String answerB) {
			this.answerB = answerB;
		}

		public String getAnswerC() {
			return answerC;
		}

		public void setAnswerC(String answerC) {
			this.answerC = answerC;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

}
