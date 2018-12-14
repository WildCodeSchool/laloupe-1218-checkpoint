package com.wildcodeschool.quizz.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.quizz.entities.Question;
import com.wildcodeschool.quizz.repository.QuestionRepository;

@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("Question");
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public void run(String...args) throws Exception {
		LOG.info("********************");
		LOG.info("Objects in DB : " + questionRepository.count());
		
		Question question1 = new Question("Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet");
		LOG.info("******************");
		LOG.info(question1 + " has been created !");
        questionRepository.save(question1);
        LOG.info(question1 + " has been saved !");
	}

}
