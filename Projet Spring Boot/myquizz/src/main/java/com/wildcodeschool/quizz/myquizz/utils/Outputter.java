package com.wildcodeschool.quizz.myquizz.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.quizz.myquizz.entities.Question;
import com.wildcodeschool.quizz.myquizz.entities.Reponse;

import com.wildcodeschool.quizz.myquizz.repositories.myquizzDAO;


@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Wilder");

    @Autowired
    private myquizzDAO userDao;

    @Override
    public void run(String... args) throws Exception {

    	// Liste les utilisateurs enregistrés dans la BDD
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(Question myQuestion : userDao.findAll()) {
            LOG.info(myQuestion.toString());
        };
     
    }    
}