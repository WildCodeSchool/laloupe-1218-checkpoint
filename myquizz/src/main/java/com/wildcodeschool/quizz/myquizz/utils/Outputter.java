package com.wildcodeschool.quizz.myquizz.utils;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.repositories.QuestionDao;

public class Outputter implements CommandLineRunner{

	private Logger LOG = LoggerFactory.getLogger("Question");
	
	@Autowired
    private QuestionDao questionDao;
	
	@Override
    public void run(String... args) throws Exception {
		LOG.info("******************");
		LOG.info("Objects in DB : " + questionDao.count());

        Question question1 = new Question("Un client peut accéder à votre servlet uniquement si cette servlet se trouve sur un __________ qui peut répondre aux requêtes de servlet");
        LOG.info("******************");
        LOG.info(question1 + " has been created !");
        questionDao.save(question1);
        LOG.info(question1 + " has been saved !");
    }
}
