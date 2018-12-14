package fr.checkpoint3.championsquestions.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.checkpoint3.championsquestions.entities.Answers;
import fr.checkpoint3.championsquestions.entities.Question;
import fr.checkpoint3.championsquestions.repositories.Answersrepo;
import fr.checkpoint3.championsquestions.repositories.QuestionRepo;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepo questionrepo;
	
	@Autowired
	Answersrepo answersrepo;
	
	
	@RequestMapping("/create/question")
	public Question createQuestion(String epreuve, int epreuve_id) {
		Question question = new Question(epreuve, epreuve_id);
		return questionrepo.save(question);
	}
	
	@RequestMapping("/create/answers")
	public Answers createAnswers(String response_1,String response_2, String response_3, String response_4,  int epreuve_id) {
		Answers reponse = new Answers(response_1, response_2, response_3, response_4, epreuve_id);
		return answersrepo.save(reponse);
	}
	
	@RequestMapping("/readAll")
	public List<Question> getAllQuestions() {
		return questionrepo.findAll();
	}
	

	

}
