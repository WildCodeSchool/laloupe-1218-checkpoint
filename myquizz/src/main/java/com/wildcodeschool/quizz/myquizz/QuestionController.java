package com.wildcodeschool.quizz.myquizz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wildcodeschool.quizz.myquizz.QuestionRepository;

@RestController
public class QuestionController {

	@Autowired
	QuestionRepository questionRepo;
	
	
	@RequestMapping("/questions")
	public List<Question> getAllQuestion() {
		return questionRepo.findAll();
	}
}
